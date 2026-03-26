/*  Nama File: IResize.java
    Deskripsi: berisi interface IResize
    Pembuat: 24060124140136 / Arini Latifatul Qalbiah
    Tanggal: 26 Maret 2026
    */
    
    public interface IResize {

    // menambah ukuran menjadi 10% lebih besar
    void zoomIn();

    // mengurangi ukuran menjadi 10% lebih kecil
    void zoomOut();

    // menskalakan ukuran sesuai dengan input percent yang diberikan
    void zoom(int percent);
}

