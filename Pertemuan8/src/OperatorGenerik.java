/*  NIM: 24060124140136
    Nama: Arini latifatul Qalbiah
    Tanggal: 3 Mei 2026
    */

public class OperatorGenerik {
    // class pembungkus
    public static class Box<T> {
        public T value;

        public Box(T value) {
            this.value = value;
        }
    }

    // prosedur Tukar
    public static <T> void Tukar(Box<T> a, Box<T> b) {
        T temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    // fungsi Bobot2
    public static double Bobot2(Kucing k1, Kucing k2) {
        return k1.getBobot() + k2.getBobot();
    }
}