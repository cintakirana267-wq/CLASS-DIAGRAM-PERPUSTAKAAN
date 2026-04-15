public class Pustaka {
    int idBuku;
    String judul;
    String penulis;
    String penerbit;
    int tahunTerbit;
    int stok;
    String status;

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

    public void tampilInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Stok: " + stok);
    }
}
