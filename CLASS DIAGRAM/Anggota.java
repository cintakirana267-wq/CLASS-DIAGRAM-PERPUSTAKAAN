public class Anggota extends User {
    int idAnggota;
    String nim;
    String noTelepon;
    String alamat;

    public Anggota(String nama, int idUser, String email, String password,
                   int idAnggota, String nim, String noTelepon, String alamat) {
        super(nama, idUser, email, password);
        this.idAnggota = idAnggota;
        this.nim = nim;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
    }

    public void pinjamBuku() {
        System.out.println(nama + " meminjam buku");
    }

    public void kembalikanBuku() {
        System.out.println(nama + " mengembalikan buku");
    }

    public void lihatRiwayat() {
        System.out.println("Menampilkan riwayat peminjaman " + nama);
    }
}