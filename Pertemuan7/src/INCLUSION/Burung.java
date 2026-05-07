/*  Nama File: Burung.java
    Deskripsi: Program untuk realisasi kelas Burung yang merupakan subclass dari kelas abstrak Anabul, dengan implementasi metode gerak() dan bersuara() sesuai karakteristik burung.
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 26 April 2026
    */

package INCLUSION;

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi ciut");
    }
    
}