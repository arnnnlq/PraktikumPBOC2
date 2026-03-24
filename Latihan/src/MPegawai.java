/*  Nama File: MPegawai.java
    Deskripsi: berisi atribut dan metode dalam class Dosen
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 20 Maret 2026
    */

import java.time.LocalDate;

public class MPegawai {
    public static void main (String[] args) {
        // Check Dosen Tetap
        DosenTetap DTetap1 = new DosenTetap("10001", "20001", "Arlecchino", LocalDate.of(2001, 4, 17), LocalDate.of(2017, 12, 1), 1000000, "Fakultas Hukum");
        System.out.println("Dosen Tetap 1:");
        DTetap1.printInfo();
        System.out.print("\n");

        DosenTetap DTetap2 = new DosenTetap();
        DTetap2.setNIP("10002");
        DTetap2.setNIDN("20002");
        DTetap2.setNama("Sandrone");
        DTetap2.setTanggalLahir(LocalDate.of(2000, 10, 10));
        DTetap2.setTMT(LocalDate.of(2020, 1, 2));
        DTetap2.setGajiPokok(700000);
        DTetap2.setFakultas("Fakultas Teknik");
        System.out.println("Dosen Tetap 2:");
        DTetap2.printInfo();
        System.out.print("\n");

        // Check Dosen Tamu
        DosenTamu DTamu1 = new DosenTamu("60001", "70001", "Columbina", LocalDate.of(2002, 3, 10), LocalDate.of(2020, 5, 9), 1100000, "Fakultas Ilmu Budaya", LocalDate.of(2030, 12, 31));
        System.out.println("Dosen Tamu 1:");
        DTamu1.printInfo();
        System.out.print("\n");

        DosenTamu DTamu2 = new DosenTamu();
        DTamu2.setNIP("60002");
        DTamu2.setNIDK("70002");
        DTamu2.setNama("Signora");
        DTamu2.setTanggalLahir(LocalDate.of(1998, 2,22));
        DTamu2.setTMT(LocalDate.of(2023, 7,1));
        DTamu2.setGajiPokok(9000000);
        DTamu2.setFakultas("Fakultas Ekonomi Bisnis");
        DTamu2.setAkhirKontrak(LocalDate.of(2035, 12, 31));
        System.out.println("Dosen Tamu 2:");
        DTamu2.printInfo();
        System.out.print("\n");

        // Check Tendik
        Tendik T1 = new Tendik("90001", "Capitano", LocalDate.of(1995, 8, 9), LocalDate.of(2015, 11, 1), 5000000, "Sumber Daya");
        System.out.println("Tendik 1:");
        T1.printInfo();
        System.out.print("\n");

        Tendik T2 = new Tendik();
        T2.setNIP("90002");
        T2.setNama("Pierro");
        T2.setTanggalLahir(LocalDate.of(1990, 1, 2));
        T2.setTMT(LocalDate.of(2015, 10,1));
        T2.setGajiPokok(7000000);
        T2.setBidang("Akademik");
        System.out.println("Tendik 2:");
        T2.printInfo();
        System.out.print("\n");
    }
}
