/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author OkaAryanata
 */
public class AplikasiPerpus {
    private Scanner s;
    private Barang barang;
    private Anggota anggota;
    //private Peminjaman peminjaman;
    private Petugas petugas;
    private Barang[] daftarBarang;
    private Anggota[] daftarAnggota;
    //private Peminjaman[] daftarPeminjaman;
    private Petugas[] daftarPetugas;
    
    public AplikasiPerpus(){
        this.barang = new Barang();
        this.anggota= new Anggota();
        //this.peminjaman = new Peminjaman();
        this.petugas = new Petugas();
        this.daftarBarang = new Barang[20];
        this.daftarAnggota = new Anggota[200];
        this.daftarPetugas = new Petugas[50];
        Petugas p1 = new Petugas();
        
    }
}
