package test;

/**
 *
 * @author wildanputra
 */
public class Anggota extends Orang {
    private Peminjaman[] peminjaman;
    private String username;
    private String password;
    private int jumlahAnggota;
    private String nama;
    private String kelamin;
    private String alamat;
    private String fakultas;
    private String jurusan;

    public Anggota(Peminjaman[] peminjaman, String username, String password, int jumlahAnggota, String nama, String kelamin, String alamat, String fakultas, String jurusan, Anggota[] anggota) {
        this.peminjaman = peminjaman;
        this.username = username;
        this.password = password;
        this.jumlahAnggota = jumlahAnggota;
        this.nama = nama;
        this.kelamin = kelamin;
        this.alamat = alamat;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.anggota = anggota;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    
    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getKelamin() {
        return kelamin;
    }

    @Override
    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    private Anggota[] anggota;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getJumlahAnggota() {
        return jumlahAnggota;
    }

    public void setJumlahAnggota(int jumlahAnggota) {
        this.jumlahAnggota = jumlahAnggota;
    }

    public Anggota[] getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota[] anggota) {
        this.anggota = anggota;
    }
    
    public String toString(){
        String x = "Username = " + this.getUsername() +
                   "\nPassword = " + this.getPassword() +
                   "\nJumlah Anggota = " + this.getJumlahAnggota() +
                   "\nAnggota = " + this.getAnggota();
               
        return x;
    }  
    
}
