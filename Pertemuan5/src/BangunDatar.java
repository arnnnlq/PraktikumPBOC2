/*  Nama File: BangunDatar.java
    Deskripsi: berisi atribut dan metode dalam class BangunDatar
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 26 Maret 2026
    */

public abstract class BangunDatar {
    protected String warna;
    protected String border;

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}