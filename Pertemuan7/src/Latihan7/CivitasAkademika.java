/*  NIM: 24060124140136
    Nama: Arini latifatul Qalbiah
    Tanggal: 26 April 2026
    */

package Latihan7;

abstract public class CivitasAkademika {
    protected String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract String getNomor();
}