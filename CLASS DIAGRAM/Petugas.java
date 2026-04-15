public class Petugas extends User {
    int idPetugas;
    String jabatan;

    public Petugas(String nama, int idUser, String email, String password,
                   int idPetugas, String jabatan) {
        super(nama, idUser, email, password);
        this.idPetugas = idPetugas;
        this.jabatan = jabatan;
    }

    public void tambahBuku() {
        System.out.println("Petugas menambahkan buku");
    }

    public void hapusBuku() {
        System.out.println("Petugas menghapus buku");
    }

    public void updateBuku() {
        System.out.println("Petugas mengupdate buku");
    }

    public void verifikasiPeminjaman() {
        System.out.println("Peminjaman diverifikasi");
    }
}