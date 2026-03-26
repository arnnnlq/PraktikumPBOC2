/*  Nama File: Persegi.java
    Deskripsi: berisi atribut dan metode dalam class Persegi
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 26 Maret 2026
    */

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double getLuas(){
        return sisi * sisi;
    }

    @Override
    public double getKeliling(){
        return 4 * sisi;
    }

    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent / 100;
    }
}