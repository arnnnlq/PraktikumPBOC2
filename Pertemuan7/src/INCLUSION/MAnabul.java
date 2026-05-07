/*  Nama File: MAnabul.java
    Deskripsi: Program untuk penggunaan kelas abstrak Anabul dan subclass-subclassnya (Anjing, Kucing, Burung) dengan membuat objek dari masing-masing kelas dan memanggil metode gerak() dan bersuara() untuk menunjukkan karakteristik masing-masing hewan.
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 26 April 2026
    */

package INCLUSION;

public class MAnabul {
    public static void main(String[] args) {
        Anabul anjing = new Anjing("Arlecchino");
        Anabul kucing = new Kucing("Columbina");
        Anabul burung = new Burung("Sandrone");

        System.out.println("Anjing:");
        anjing.gerak();
        anjing.bersuara();

        System.out.println("\nKucing:");
        kucing.gerak();
        kucing.bersuara();

        System.out.println("\nBurung:");
        burung.gerak();
        burung.bersuara();
    }
}