/*  NIM: 24060124140136
    Nama: Arini latifatul Qalbiah
    Tanggal: 7 Mei 2026
    */

import java.util.ArrayList;

public class Teman {
    private int nbelm;
    private ArrayList<String> Lnama;

    // Konstruktor
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // a. getNbelm()
    public int getNbelm() {
        return nbelm;
    }

    // b. getNama(indeks)
    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    // c. setNama(indeks, nama)
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    // d. addNama(nama)
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // e. delNama(nama)
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
        nbelm--;
    }
}
    
    // f. isMember(nama)
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // g. gantiNama(nama, namabaru)
    public void gantiNama(String nama, String namabaru) {
     int indeks = Lnama.indexOf(nama);
        if (indeks != -1) {
            Lnama.set(indeks, namabaru);
        }
    }

    // h. countNama(nama)
    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    // i. showTeman()
    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (String nama : Lnama) {
            System.out.println("- " + nama);
        }
    }
}