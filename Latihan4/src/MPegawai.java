/*  Nama File: Pegawai.java
    Deskripsi: berisi main package untuk Latihan4
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 20 Maret 2026
    */

import java.time.LocalDate;

public class MPegawai {
    public static void main (String[] args) {
        // Check Dosen Tetap
        DosenTetap DTetap1 = new DosenTetap("10001", "20001", "Arlecchino", LocalDate.of(2000, 1, 2), LocalDate.of(2020, 2, 20), 1000000, "Fakultas Hukum");
        System.out.println("Dosen Tetap 1:");
        DTetap1.printInfo();
        System.out.print("\n");

        DosenTetap DTetap2 = new DosenTetap();
        DTetap2.setNIP("10002");
        DTetap2.setNIDN("20002");
        DTetap2.setNama("Sandrone");
        DTetap2.setTanggalLahir(LocalDate.of(2001, 2, 2));
        DTetap2.setTMT(LocalDate.of(2021, 2, 21));
        DTetap2.setGajiPokok(6000000);
        DTetap2.setFakultas("Fakultas Teknik");
        System.out.println("Dosen Tetap 2:");
        DTetap2.printInfo();
        System.out.print("\n");

        // Check Dosen Tamu
        DosenTamu DTamu1 = new DosenTamu("60001", "90001", "Columbina", LocalDate.of(2002, 3, 3), LocalDate.of(2022, 3, 23), 7000000, "Fakultas Ilmu Budaya", LocalDate.of(2030, 12, 31));
        System.out.println("Dosen Tamu 1:");
        DTamu1.printInfo();
        System.out.print("\n");

        DosenTamu DTamu2 = new DosenTamu();
        DTamu2.setNIP("60002");
        DTamu2.setNIDK("90002");
        DTamu2.setNama("Signora");
        DTamu2.setTanggalLahir(LocalDate.of(2003, 4,4));
        DTamu2.setTMT(LocalDate.of(2023, 4,14));
        DTamu2.setGajiPokok(5000000);
        DTamu2.setFakultas("Fakultas Kedokteran");
        DTamu2.setAkhirKontrak(LocalDate.of(2031, 12, 31));
        System.out.println("Dosen Tamu 2:");
        DTamu2.printInfo();
        System.out.print("\n");

        // Check Tendik
        Tendik T1 = new Tendik("30001", "Capitano", LocalDate.of(1990, 12, 10), LocalDate.of(2015, 1, 5), 4000000, "Sumber Daya");
        System.out.println("Tendik 1:");
        T1.printInfo();
        System.out.print("\n");

        Tendik T2 = new Tendik();
        T2.setNIP("30002");
        T2.setNama("Pierro");
        T2.setTanggalLahir(LocalDate.of(1995, 11, 20));
        T2.setTMT(LocalDate.of(2010, 2,10));
        T2.setGajiPokok(5500000);
        T2.setBidang("Akademik");
        System.out.println("Tendik 2:");
        T2.printInfo();
        System.out.print("\n");
    }
}
