/*  NIM: 24060124140136
    Nama: Arini latifatul Qalbiah
    Tanggal: 3 Mei 2026
    */

public class Anjing extends Anabul {
    private double bobot;

    public Anjing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }

    public double getBobot() {
        return bobot;
    }
}