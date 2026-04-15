public class User {
    protected String nama;
    protected int idUser;
    protected String email;
    protected String password;

    public User(String nama, int idUser, String email, String password) {
        this.nama = nama;
        this.idUser = idUser;
        this.email = email;
        this.password = password;
    }

    public void login() {
        System.out.println(nama + " berhasil login");
    }

    public void logout() {
        System.out.println(nama + " logout");
    }

    public void ubahPassword(String passwordBaru) {
        this.password = passwordBaru;
        System.out.println("Password berhasil diubah");
    }
}