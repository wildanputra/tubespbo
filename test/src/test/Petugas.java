/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author wildanputra
 */
public class Petugas extends Orang{
    private String username;
    private String password;
    private String nip;
    private int jumlahPetugas;
    private String nama;
    private String kelamin;
    private String alamat;
    private Petugas[] daftarPetugas;
    boolean c; // check
    int d;
    
    public Petugas(){};
    public Petugas(String username, String password, String nip, String nama, String alamat, String kelamin){
        this.nama=nama;
        this.alamat=alamat;
        this.kelamin=kelamin;
        this.nip=nip;
        this.password=password;
        this.username=username;
    }
    
    public Petugas getDaftarPetugas(int x) {
        return daftarPetugas[x];
    }

    public void setDaftarPetugas(Petugas[] daftarPetugas) {
        this.daftarPetugas = daftarPetugas;
    }
    
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

    public int getJumlahPetugas() {
        return jumlahPetugas;
    }

    public void setJumlahPetugas(int jumlahPetugas) {
        this.jumlahPetugas = jumlahPetugas;
    }
    
    @Override
    public void setNama(String nama){
        this.nama=nama;
    }

    @Override
    public String getNama(){
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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

    /**
     *
     * @param alamat
     */
    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void addPetugas(Petugas p){
        if (getJumlahPetugas()<daftarPetugas.length){
            daftarPetugas[getJumlahPetugas()] = p;
            setJumlahPetugas(getJumlahPetugas()+1);
        }
        else System.out.println("Petugas sudah mencapai batas maksimal");       
    }
    
    public void getPetugas(String username){
        for(int j=0; j<getJumlahPetugas();j++){
                if(getDaftarPetugas(j).getUsername().equals(username)){
                    c = true;
                    d=j;
                }
        }
                if(c==false){
                System.out.println("Petugas tidak ditemukan");
                }
    }
    
    @Override
    public String toString(){
        String x = "Username = " + this.getUsername() +
                   "\nPassword = " + this.getPassword() +
                   "\nJumlah Petugas = " + this.getJumlahPetugas()+
                   "\nNama = " + this.getNama() +
                   "\nKelamin = " + this.getKelamin() +
                   "\nAlamat = " + this.getAlamat() +
                   "\nNIP = " + this.getNip();               
        return x;
    }        
}
