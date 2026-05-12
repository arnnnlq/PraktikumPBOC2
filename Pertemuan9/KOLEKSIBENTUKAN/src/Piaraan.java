/*  NIM: 24060124140136
    Nama: Arini latifatul Qalbiah
    Tanggal: 7 Mei 2026
    */

import java.util.LinkedList;

public class Piaraan {
    private int nbelm;
    private final LinkedList<Anabul> lanabul;

public Piaraan() {
    lanabul = new LinkedList<>();
    nbelm = 0;
}

// b. i
public int getNbelm() {
    return nbelm;
}

// b. ii
public void enqueueAnabul(Anabul anabul) {
    lanabul.addLast(anabul);
    nbelm++;
}

// b. iii
public boolean isMember(Anabul anabul)  {
    return lanabul.contains(anabul);
}

// b. iv
public Anabul getAnabul() {
    return lanabul.peekFirst();
}

// b. v
public Anabul dequeueAnabul() {
    if (!lanabul.isEmpty()) {
            nbelm--;
            return lanabul.removeFirst();
        }
        return null;
    }

// c. 
public void showAnabul() {
    System.out.println("Daftar Anabul (nama panggilan):");
    for (Anabul anabul : lanabul) {
        System.out.println("- " + anabul.getNama());
    }
}

// d.
public int countKucing() {
    int count = 0;
    for (Anabul anabul : lanabul) {
        if (anabul instanceof Kucing) {
            count++;
        }
    }
    return count;
}

// e.
public double bobotKucing() {
    double total = 0.0;
    for (Anabul anabul : lanabul) {
        if (anabul instanceof Kucing) {
            total += ((Kucing) anabul).getBobot();
        }
    }
    return total;
}

// f.
public void showJenisAnabul() {
    for (Anabul anabul : lanabul) {
        System.out.println(anabul.getNama() + " - " + anabul.getClass().getName());
    }
}
}