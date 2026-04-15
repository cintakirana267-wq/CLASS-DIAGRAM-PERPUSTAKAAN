public class Main {
    public static void main(String[] args) {

        Anggota a1 = new Anggota(
                "Leonita", 1, "leo@gmail.com", "123",
                101, "2515101081", "0812345", "Denpasar"
        );

        Pustaka buku1 = new Pustaka(
                10, "Java Programming", "Andi",
                "Erlangga", 2020, 5, "Tersedia"
        );

        a1.login();
        a1.pinjamBuku();

        buku1.tampilInfo();

    
    }
}