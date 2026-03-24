/*  Nama File: Lingkaran.java
    Deskripsi: berisi atribut dan metode dalam class Lingkaran
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 12 Maret 2026
    */

public class Lingkaran extends BangunDatar {
    /*********** ATRIBUT ***********/
    private double jari;

    /*********** METHOD ***********/
    // Konstruktor 
    public Lingkaran() {
        setJmlSisi(0);
    }

    public Lingkaran(double jari, String warna, String border) {
        this.jari = jari;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }

    // Getter Lingkaran
    public double getJari() {
        return jari;
    }

    // Setter Lingkaran
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Menghitung Luas
    public double getLuas() {
        return (22/7) * jari * jari;
    }

    // Menghitung Keliling
    public double getKeliling() {
        return 2 * (22/7) * jari;
    }

    // Menghitung Diameter
    public double getDiameter() {
        return jari * 2;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari: " + jari);
    }

    
}
