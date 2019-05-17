/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8;

/**
 *
 * @author hendr
 */
public class Sesi_5_DemoKenaikanGaji {
    private double gajiPokok;
    private double persenNaik;
    private String jabatan;
    private String noPegawai;
    
    public Sesi_5_DemoKenaikanGaji(String id, String jabatan, double gaji, double persen) {
        this.noPegawai = id;
        this.jabatan = jabatan;
        this.gajiPokok = gaji;
        this.persenNaik = persen;
    }
    
    public double getGajiBaru() {
        double gajiBaru = gajiPokok + (persenNaik / 100) * gajiPokok;
        return gajiBaru;
    }
    
    public String getNoPegawai() {
        return noPegawai;
    }
    
    public String getJabatan() {
        return jabatan;
    }
    
    public double getBonus() {
        double bonus = gajiPokok / persenNaik;
        return bonus;
    }
    
    public static void main(String[] args) {
        Sesi_5_DemoKenaikanGaji Santi = new Sesi_5_DemoKenaikanGaji("SBY001", "Manager", 4000000, 5);
        Sesi_5_DemoKenaikanGaji Ronny = new Sesi_5_DemoKenaikanGaji("BDG0371", "Staff", 2000000, 7.5);
        Sesi_5_DemoKenaikanGaji Indra = new Sesi_5_DemoKenaikanGaji("JKT0189", "Direktur", 8000000, 3);
        
        double gajiSanti = Santi.getGajiBaru();
        double gajiRonny = Ronny.getGajiBaru();
        double gajiIndra = Indra.getGajiBaru();
        
        String idSanti = Santi.getNoPegawai();
        String idRonny = Ronny.getNoPegawai();
        String idIndra = Indra.getNoPegawai();
        
        String jbSanti = Santi.getJabatan();
        String jbRonny = Ronny.getJabatan();
        String jbIndra = Indra.getJabatan();
        
        double bonusSanti = Santi.getBonus();
        double bonusRonny = Ronny.getBonus();
        double bonusIndra = Indra.getBonus();
        
        System.out.println("\nPROGRAM MENGHITUNG KENAIKAN GAJI");
        System.out.println("----------------------------------\n");
        
        System.out.println("Santi");
        System.out.println("No Pegawai" + "\t" + ": " + idSanti);
        System.out.println("Jabatan\t" + "\t" + ": " + jbSanti);
        System.out.println("Gaji Baru" + "\t" + ": Rp." + String.format("%,d", Math.round(gajiSanti)));
        System.out.println("Bonus\t" + "\t" + ": Rp." + String.format("%,d", Math.round(bonusSanti)));
        System.out.println("Gaji Bersih" + "\t" + ": Rp." + String.format("%,d", Math.round(gajiSanti + bonusSanti)) + "\n");
        
        System.out.println("Ronny");
        System.out.println("No Pegawai" + "\t" + ": " + idRonny);
        System.out.println("Jabatan\t" + "\t" + ": " + jbRonny);
        System.out.println("Gaji Baru" + "\t" + ": Rp." + String.format("%,d", Math.round(gajiRonny)));
        System.out.println("Bonus\t" + "\t" + ": Rp." + String.format("%,d", Math.round(bonusRonny)));
        System.out.println("Gaji Bersih" + "\t" + ": Rp." + String.format("%,d", Math.round(gajiRonny + bonusRonny)) + "\n");
        
        System.out.println("Indra");
        System.out.println("No Pegawai" + "\t" + ": " + idIndra);
        System.out.println("Jabatan\t" + "\t" + ": " + jbIndra);
        System.out.println("Gaji Baru" + "\t" + ": Rp." + String.format("%,d", Math.round(gajiIndra)));
        System.out.println("Bonus\t" + "\t" + ": Rp." + String.format("%,d", Math.round(bonusIndra)));
        System.out.println("Gaji Bersih" + "\t" + ": Rp." + String.format("%,d", Math.round(gajiIndra + bonusIndra)) + "\n");
        
    }
    
}
