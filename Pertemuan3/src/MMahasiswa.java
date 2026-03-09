/*  Nama File: MMahasiswa.java
    Deskripsi: Main untuk package Pertemuan3
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 9 Maret 2026
    */

public class MMahasiswa {
    public static void main (String[] args) {
        // Check Dosen
        Dosen D1 = new Dosen("0001", "Arlecchino", "Kedokteran");
        System.out.println("Dosen 1:");
        System.out.println("- NIP: " + D1.getNIP());
        System.out.println("- Nama: " + D1.getNama());
        System.out.println("- Prodi: " + D1.getProdi());
        System.out.print("\n");

        Dosen D2 = new Dosen();
        D2.setNIP("0002");
        D2.setNama("Sandrone");
        D2.setProdi("Bioteknologi");
        System.out.println("Dosen 2:");
        System.out.println("- NIP: " + D2.getNIP());
        System.out.println("- Nama: " + D2.getNama());
        System.out.println("- Prodi: " + D2.getProdi());
        System.out.print("\n");

        // Check Mata Kuliah
        MataKuliah MK1 = new MataKuliah("KK01", "Anatomi", 4);
        System.out.println("Mata Kuliah 1:");
        System.out.println("- ID Matkul: " + MK1.getIdMatkul());
        System.out.println("- Nama Matkul: " + MK1.getNama());
        System.out.println("- SKS: " + MK1.getSKS());
        System.out.print("\n");

        MataKuliah MK2 = new MataKuliah();
        MK2.setIdMatkul("KK02");
        MK2.setNama("Biokimia");
        MK2.setSKS(3);
        System.out.println("Mata Kuliah 2:");
        System.out.println("- ID Matkul: " + MK2.getIdMatkul());
        System.out.println("- Nama Matkul: " + MK2.getNama());
        System.out.println("- SKS: " + MK2.getSKS());
        System.out.print("\n");

        // Check Kendaraan
        Kendaraan K1 = new Kendaraan("DD4444RIN", "Mobil");
        System.out.println("Kendaraan 1:");
        System.out.println("- No Plat: " + K1.getNoPlat());
        System.out.println("- Jenis: " + K1.getJenis());
        System.out.print("\n");

        Kendaraan K2 = new Kendaraan();
        K2.setNoPlat("DD0210ARN");
        K2.setJenis("Motor");
        System.out.println("Kendaraan 2:");
        System.out.println("- No Plat: " + K2.getNoPlat());
        System.out.println("- Jenis: " + K2.getJenis());
        System.out.print("\n");

        // Check Mahasiswa
        Mahasiswa M1 = new Mahasiswa("1010", "Columbina", "Biologi");
        M1.addMatkul(MK1);
        M1.addMatkul(MK2);
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        System.out.println("Mahasiswa 1:");
        M1.printMhs();
        System.out.print("\n");
        System.out.println("Detail Mahasiswa 1:");
        M1.printDetailMhs();
        System.out.println("Total Mata Kuliah: " + M1.getJumlahMatkul());
        System.out.println("Total SKS: " + M1.getJumlahSKS());
    }
}
