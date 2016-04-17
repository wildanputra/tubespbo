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
public class Petugas {
    private String username;
    private String password;
    private String nip;
    private int jumlahPetugas;
    private Petugas[] p;

    public String getNIP() {
        return nip;
    }

    public void setNIP(String NIP) {
        this.nip = nip;
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

    public Petugas[] getP() {
        return p;
    }

    public void setP(Petugas[] p) {
        this.p = p;
    }
    
    
}
