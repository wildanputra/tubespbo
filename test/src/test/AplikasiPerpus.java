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
    private Petugas petugas;
    
    public AplikasiPerpus(){
        this.barang = new Barang();
        this.anggota= new Anggota();
        this.petugas = new Petugas();
        Petugas p1 = new Petugas("okaaryanata", "okaaryanata", "1301140220", "okaaryanata", "bali", "laki-laki");
        Petugas p2 = new Petugas("wildanputra", "wildanputra", "1301140210", "wildanputra", "bandung", "laki-laki");
        Petugas p3 = new Petugas("ariananggada", "ariananggada", "1301140400", "ariananggada", "bali", "laki-laki");
        Barang b1 = new Barang("PBO", "robert", "Hilang satu halaman", "tersedia", 121);
        Barang b2 = new Barang("COA", "minus", "Hilang dua halaman", "tersedia", 122);
        Barang b3 = new Barang("RPL", "marcel", "Hilang satu halaman", "tersedia", 123);
        this.barang.setBooklist(new Barang[200]);
        this.anggota.setDaftarAnggota(new Anggota[200]);
        this.petugas.setDaftarPetugas(new Petugas[50]);
        this.barang.addBook(b1);
        this.barang.addBook(b2);
        this.barang.addBook(b3);
        this.petugas.addPetugas(p1);
        this.petugas.addPetugas(p2);
        this.petugas.addPetugas(p3);
    }
    
    public void menuAwal(){
        
    }
}
