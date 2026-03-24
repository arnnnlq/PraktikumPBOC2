/*  Nama File: Persegi.java
    Deskripsi: berisi atribut dan metode dalam class Persegi
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 12 Maret 2026
    */

public class Persegi extends BangunDatar {
    /*********** ATRIBUT ***********/
    private double sisi;
    
    /*********** METHOD ***********/
    // Konstruktor 
    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    // Getter Persegi
    public double getSisi() {
        return sisi;
    }

    // Setter Persegi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Menghitung Luas
    public double getLuas() {
        return sisi * sisi;
    }

    // Menghitung Keliling
    public double getKeliling() {
        return sisi = 4;
    }

    // Menghitung Diagonal
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}
