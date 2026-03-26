/*  Nama File: Lingkaran.java
    Deskripsi: berisi atribut dan metode dalam class Lingkaran
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 26 Maret 2026
    */

public class Lingkaran extends BangunDatar implements IResize {
    
    /**** ATRIBUT ****/
    private double jari;

    public Lingkaran(double jari){
        this.jari = jari;
    }

    @Override
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent / 100;
    }
}