/*  NIM: 24060124140136
    Nama: Arini latifatul Qalbiah
    Tanggal: 3 Mei 2026
    */

public class Anggora extends Kucing {
    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " berjalan dengan anggun");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong lembut");
    }
}