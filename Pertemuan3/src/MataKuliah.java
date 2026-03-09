/*  Nama File: MataKuliah.java
    Deskripsi: berisi atribut dan metode dalam class MataKuliah
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 9 Maret 2026
    */

public class MataKuliah {
    /*********** ATRIBUT ***********/
    private String idMatKul;
    private String Nama;
    private int SKS;

    /*********** METHOD ***********/
    // Konstruktor
    MataKuliah() {
        this.idMatKul = "";
        this.Nama = "";
        this.SKS = 0;
    }
    
    MataKuliah(String idMatkul, String Nama, int SKS) {
        this.idMatKul = idMatkul;
        this.Nama = Nama;
        this.SKS = SKS;
    }

    // Getter MataKuliah
    String getIdMatkul() {
        return idMatKul;
    }

    String getNama() {
        return Nama;
    }

    int getSKS() {
        return SKS;
    }

    // Setter Mata Kuliah
    void setIdMatkul(String D) {
        idMatKul = D;
    }

    void setNama(String E) {
        Nama = E;
    }

    void setSKS(int F) {
        SKS = F;
    }
}
