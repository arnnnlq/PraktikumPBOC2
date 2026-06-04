import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map untuk menampilkan
 *            key (NIM) dan value (Nama Mahasiswa).
 */

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat objek Map dengan NIM sebagai Key (String) dan Nama sebagai Value (String)
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124140101", "Arlecchino");
        mahasiswaMap.put("24060124140102", "Sandrone");
        mahasiswaMap.put("24060124140103", "Columbina");
        mahasiswaMap.put("24060124140104", "Signora");

        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}