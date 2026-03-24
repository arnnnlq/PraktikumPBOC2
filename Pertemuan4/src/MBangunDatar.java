/*  Nama File: MBangunDatar.java
    Deskripsi: Main untuk package Pertemuan4
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 12 Maret 2026
    */

public class MBangunDatar {
    public static void main (String[] args) {
        // Cek Persegi
        Persegi P1 = new Persegi(4, "Pink", "Putih");
        System.out.println("# Persegi 1");
        P1.printInfo();
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());
        System.out.println("Diagonal: " + P1.getDiagonal());
        System.out.print("\n");

        // Check Lingkaran
        Lingkaran L1 = new Lingkaran(14, "Cream", "Coklat");
        System.out.println("# Lingkaran 1");
        L1.printInfo();
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());
        System.out.println("Diameter: " + L1.getDiameter());
        System.out.print("\n");

        BangunDatar.printCounterBangunDatar();
    }
                              
}
