public class Pengembalian {
    String kodeKembali;
    String tanggalKembali;
    double denda;

    public Pengembalian(String kodeKembali, String tanggalKembali, double denda) {
        this.kodeKembali = kodeKembali;
        this.tanggalKembali = tanggalKembali;
        this.denda = denda;
    }

    public void prosesKembali() {
        System.out.println("Proses pengembalian selesai. Denda: " + denda);
    }
}