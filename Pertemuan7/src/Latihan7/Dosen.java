/*  NIM: 24060124140136
    Nama: Arini latifatul Qalbiah
    Tanggal: 26 April 2026
    */

package Latihan7;

public class Dosen extends CivitasAkademika {
    private String NIP;

    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }
}