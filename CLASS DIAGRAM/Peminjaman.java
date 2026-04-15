public class Peminjaman {
    String kodePinjam;
    String tanggalPinjam;
    String tanggalHrsKembali;
    String statusPinjam;
    int jumlahBukuPinjam;

    public Peminjaman(String kodePinjam, String tanggalPinjam,
                      String tanggalHrsKembali, String statusPinjam,
                      int jumlahBukuPinjam) {
        this.kodePinjam = kodePinjam;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalHrsKembali = tanggalHrsKembali;
        this.statusPinjam = statusPinjam;
        this.jumlahBukuPinjam = jumlahBukuPinjam;
    }

    public void prosesPinjam() {
        System.out.println("Proses peminjaman berhasil");
    }
}