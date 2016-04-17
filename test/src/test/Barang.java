/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author wildanputra
 */
public class Barang {
    private String judul, penerbit, deskripsi, kondisi, status;
    private long kode;
    private int jumlahBuku = 0;
    private Barang[] booklist;
    private int tmpCari = 0;
    private int idxBuku=999;

    public int getTmpCari() {
        return tmpCari;
    }

    public void setTmpCari(int tmpCari) {
        this.tmpCari = tmpCari;
    }

    
    public String getJudul() {
        return judul;
    }

    public Barang getBooklist(int x) {
        return booklist[x];
    }

    public void setBooklist(Barang[] booklist) {
        this.booklist = booklist;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getIdxBuku() {
        return idxBuku;
    }

    public void setIdxBuku(int idxBuku) {
        this.idxBuku = idxBuku;
    }
    
    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getKode() {
        return kode;
    }

    public void setKode(long kode) {
        this.kode = kode;
    }

    public int getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(int jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }
    
    public Barang(){}
    public Barang(String judul,String penerbit, String kondisi, String status,long kode){
        this.judul = judul;
        this.kondisi=kondisi;
        this.status=status;
        this.kode=kode;
        this.penerbit= penerbit;
    } 
    
    public void addBook(Barang b){
        if (jumlahBuku<booklist.length){
            booklist[jumlahBuku] = b;
            jumlahBuku++;
            tmpCari=1;
        }
        else System.out.println("Booklist full");
        tmpCari=0;
    }
    
    public void getBookIdx(int j){
            if(booklist[j]!=null){
                idxBuku = j;
                System.out.println(getBooklist(j).toString());
                tmpCari=1;
            } 
            if(tmpCari!=1){
                System.out.println("Buku tidak ditemukan");
            }
    }
    
    public void getBookKode(long i){
        for(int j=0;j<=jumlahBuku;j++) {
            if(getBooklist(j).getKode()== i){
            idxBuku = j;
            System.out.println(getBooklist(j).toString());
            tmpCari=1;
            } 
        }
            if(tmpCari!=1){
                System.out.println("Buku tidak ditemukan");
            }
    } 
       
    
    public void getBookJudul(String judul){
        for(int j=0;j<jumlahBuku;j++) {
            if(getBooklist(j).getJudul()== judul){
                idxBuku = j;
                System.out.println(getBooklist(j).toString());
                tmpCari=1;
            } 
        }
        if(tmpCari!=1){
            System.out.println("Buku tidak ditemukan");
        } 
    }
    
    public void removeBookIdx(int j){//remove by index
        int i;
        if(booklist[j]!=null){
            booklist[j]=null;
            do{
                i = j+1;
                booklist[j]=booklist[i];
                j = i;
            } while(i!=jumlahBuku);
                System.out.println("Buku berhasil dihapus");
                tmpCari=1;
            }
            else {
                System.out.println("Buku tidak ditemukan");
                tmpCari=0;
            }
    }
    
    public void removeBookKode(long kode){//remove book by kode
        int i;
        for(int j=0;j<=jumlahBuku;j++) {
            if(booklist[j].getKode() == kode){
                booklist[j]=null;
                do{
                i = j+1;
                booklist[j]=booklist[i];
                j = i;
            } while(i!=jumlahBuku);
                System.out.println("Buku berhasil dihapus");
                tmpCari=1;
            }
            else{
                System.out.println("Buku tidak ditemukan");
                tmpCari=0;
            }
        }
    }
    
    @Override
    public String toString(){
        String x = "Judul = " + this.getJudul() +
                   "\nPenerbit = " + this.getPenerbit() +
                   "\nKondisi = " + this.getKondisi() +
                   "\nStatus = " + this.getStatus() +
                   "\nKode = " + this.getKode();
               
        return x;
    }
}
