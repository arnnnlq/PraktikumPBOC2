/*  NIM: 24060124140136
    Nama: Arini latifatul Qalbiah
    Tanggal: 26 April 2026
    */

package Latihan7;

public class MCivitas {
    public static void main(String[] args) {
        // e. 2 dosen dan 5 mahasiswa
        Dosen d1 = new Dosen("Pak Varka", "00001");
        Dosen d2 = new Dosen("Bu Alice", "00002");
        Mahasiswa m1 = new Mahasiswa("Arlecchino", "100001", d1);
        Mahasiswa m2 = new Mahasiswa("Columbina", "100002", d2);
        Mahasiswa m3 = new Mahasiswa("Sandrone", "100003", d1);
        Mahasiswa m4 = new Mahasiswa("Tsaritsa", "100004", d2);
        Mahasiswa m5 = new Mahasiswa("Signora", "100005", d1);

        // b. Seminar
        Seminar seminar = new Seminar();
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(d1);
        seminar.registrasi(d2);

        // c. jumlah peserta
        seminar.tampilPeserta();
        System.out.println("Jumlah Peserta: " + seminar.countPeserta());
        System.out.println("Jumlah Mahasiswa: " + seminar.countMahasiswa());

        // g. tampil peserta
        seminar.tampilPeserta();

        // h. jumlah mahasiswa
        System.out.println("Jumlah Mahasiswa: " + seminar.countMahasiswa());

        // i. ubah dosen wali
        m1.setDosenWali(d2);
        
        // j. tampilkan data mahasiswa
        m1.tampilkanData();
        m2.tampilkanData();
        m3.tampilkanData();
        m4.tampilkanData();
        m5.tampilkanData();
    }
}