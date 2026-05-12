/*  NIM: 24060124140136
    Nama: Arini latifatul Qalbiah
    Tanggal: 3 Mei 2026
    */

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " berjalan dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama + ", Bobot: " + bobot + " kg");
    }
}