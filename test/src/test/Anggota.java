package test;

/**
 *
 * @author wildanputra
 */
public class Anggota extends Orang {
    private Peminjaman[] peminjaman;
    private String username;
    private String password;
    private String nim;
    private int jumlahAnggota;
    private String nama;
    private String kelamin;
    private String alamat;
    private Anggota[] daftarAnggota;
    boolean c = false; // check
    int d=999;
    private String fakultas;
    private String jurusan;
    private int jumlahPeminjaman;

    public Anggota(){};

    public Anggota(String username, String password, String nim, String nama, String kelamin, String alamat, String fakultas, String jurusan) {
        this.username = username;
        this.password = password;
        this.nim = nim;
        this.nama = nama; 
        this.kelamin = kelamin;
        this.alamat = alamat;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
    }
    
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

    public int getJumlahPeminjaman() {
        return jumlahPeminjaman;
    }

    public void setJumlahPeminjaman(int jumlahPeminjaman) {
        this.jumlahPeminjaman = jumlahPeminjaman;
    }

    
    public Peminjaman getPeminjaman(int x) {
        return peminjaman[x];
    }

    public void setPeminjaman(Peminjaman[] peminjaman) {
        this.peminjaman = peminjaman;
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

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
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

    public Anggota getDaftarAnggota(int x) {
        return daftarAnggota[x];
    }

    public void setDaftarAnggota(Anggota[] daftarAnggota) {
        this.daftarAnggota = daftarAnggota;
    }
        
    public void addAnggota(Anggota a){
        if (getJumlahAnggota()<daftarAnggota.length){
            daftarAnggota[getJumlahAnggota()] = a;
            setJumlahAnggota(getJumlahAnggota()+1);
        }
        else System.out.println("Anggota sudah penuh");
    }

    public void getAnggotaUser(String username){
        for(int j=0; j<getJumlahAnggota();j++){
                if(getDaftarAnggota(j).getUsername().equals(username)){
                    c = true;
                    d=j;
                }
        }
                if(c==false){ 
                    System.out.println("Anggota tidak ditemukan");
                }
    }
           
    
    public void getAnggotaNim(String nim){
        for(int j=0; j<=getJumlahAnggota();j++){
                if(getDaftarAnggota(j).getNim().equals(nim)){
                    //System.out.println("bla");
                    c = true;
                    d=j;
                    
                }
        }
                if(c==false){
                    System.out.println("Anggota tidak ditemukan");
                }
    }
    
    public void deleteAnggota(String username){
        if (c ==true){
            do{
            daftarAnggota[d] = daftarAnggota[d+1];
            d++;
            }while(d!=daftarAnggota.length);
        }
    }
    
    public void addPeminjaman(Peminjaman b){
        if (getJumlahPeminjaman()<peminjaman.length){
            peminjaman[getJumlahPeminjaman()] = b;
            setJumlahPeminjaman(getJumlahPeminjaman()+1);
        }
        else System.out.println("pemijaman anda penuh");
    }
    
    @Override
    public String toString(){
        String x = "Username = " + this.getUsername() +
                   "\nPassword = " + this.getPassword() +
                   "\nNama = " + this.getNama() +
                   "\nNIM = " + this.getNim() +
                   "\nKelamin = " + this.getKelamin() +
                   "\nAlamat = " + this.getAlamat() +
                   "\nFakultas = " + this.getFakultas() +
                   "\nJurusan = " + this.getJurusan();
               
        return x;
    }
}