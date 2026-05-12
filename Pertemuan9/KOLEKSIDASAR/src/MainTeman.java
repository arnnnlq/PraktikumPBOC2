/*  NIM: 24060124140136
    Nama: Arini latifatul Qalbiah
    Tanggal: 7 Mei 2026
*/

public class MainTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        // Tambah nama
        t.addNama("Arin");
        t.addNama("Arlecchino");
        t.addNama("Sandrone");

        // Jumlah elemen
        System.out.println("Jumlah teman: " + t.getNbelm());

        // Ambil nama berdasarkan indeks
        System.out.println("Nama indeks 1: " + t.getNama(1));

        // Set nama
        t.setNama(0, "Columbina");

        // Hapus nama
        t.delNama("Arin");

        // Mengecek member
        System.out.println("Apakah Arlecchino ada? " + t.isMember("Arlecchino"));
        System.out.println("Apakah Arin ada? " + t.isMember("Arin"));

        // Ganti nama
        t.gantiNama("Sandrone", "Signora");

        // Menghitung jumlah nama
        System.out.println("Jumlah Arlecchino: " + t.countNama("Arlecchino"));
        System.out.println("Jumlah Signora: " + t.countNama("Signora"));

        // Tampilkan teman
        t.showTeman();


    }
}
