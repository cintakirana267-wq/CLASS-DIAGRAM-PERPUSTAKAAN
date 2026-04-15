public class Pustaka {
    int idBuku;
    String judul;
    String penulis;
    String penerbit;
    int tahunTerbit;
    int stok;
    String status;

    // CONSTRUCTOR (ini yang bikin error kamu hilang)
    public Pustaka(int idBuku, String judul, String penulis, String penerbit,
                   int tahunTerbit, int stok, String status) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.stok = stok;
        this.status = status;
    }

    // METHOD (ini juga wajib ada)
    public void tampilInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Stok: " + stok);
    }
}