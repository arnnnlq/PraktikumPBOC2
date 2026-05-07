/*  Nama File: Kucing.java
    Deskripsi: Program untuk realisasi kelas Kucing yang merupakan subclass dari kelas abstrak Anabul, dengan implementasi metode gerak() dan bersuara() sesuai karakteristik kucing.
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 26 April 2026
    */

package INCLUSION;

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " berjalan dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}