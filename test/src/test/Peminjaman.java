package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ian
 */
public class Peminjaman {
    private Peminjaman[] Plist;
    public long idPeminjam;
    public Barang brg;
    private String statusPeminjaman;
    private int jumlahPeminjaman = 0;
    
    public Peminjaman getPlist(int i) {
       return Plist[i];
    }
    
    public String getstatusPeminjaman() {
        return statusPeminjaman;
    }

    public void setstatusPeminjaman(String statusPeminjaman){
        this.statusPeminjaman = statusPeminjaman;
    } 
    
    public long getidPeminjam() {
        return idPeminjam;
    }

    public int getjumlahPeminjaman() {
        return jumlahPeminjaman;
    }
    
    public void setjumlahPeminjaman(int jumlahPeminjaman){
        this.jumlahPeminjaman = jumlahPeminjaman;
    }
    
    public void KembalikanPeminjaman(String statusPeminjaman){
        statusPeminjaman = "Kembali";
    }
    
    public void getPinjamanIdx(int i) {
        for (int j = 0; j <= getjumlahPeminjaman(); j++) {
            if (Plist[j] != null) {
                System.out.println("ID : "+Plist[j].getidPeminjam());
                System.out.println("Status : "+Plist[j].getstatusPeminjaman());
                }
        }
    }
    
    public Peminjaman(long idPeminjam, Barang brg, int jumlahPeminjaman){
        this.idPeminjam = idPeminjam;
        this.brg = brg;
        this.statusPeminjaman=statusPeminjaman;
        this.jumlahPeminjaman=jumlahPeminjaman;
    }
    
    public String toString(){
        String x = "Status Peminjaman = " + this.getstatusPeminjaman() +
                   "\nID Peminjam = " + this.getidPeminjam() +
                   "\nJumlah Peminjaman = " + this.getjumlahPeminjaman() +
                   "\nStatus = " + this.getstatusPeminjaman();
               
        return x;
    }

    Peminjaman pinjam = new Peminjaman(12345, brg, 1);
    
}
