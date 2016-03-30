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
    private Petugas[] p;
    
    public Petugas(String username, String Password, String nip, String nama, String alamat, String kelamin){
        
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
    
}
