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
public class Barang {
    private String judul, penerbit, deskripsi, kondisi, status;
    private long kode;
    private int jumlahBuku = 0;
    private Barang[] booklist;

    public String getJudul() {
        return judul;
    }

    public Barang[] getBooklist() {
        return booklist;
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
    
    public Barang getBooklist(int i) {
        return booklist[i];
    }
    
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
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
        this.deskripsi = deskripsi;
    } 
    
    
    
   
    
    public void addBook(Barang b){
        if (jumlahBuku<booklist.length){
            booklist[jumlahBuku] = b;
            jumlahBuku++;
        }
        else System.out.println("Booklist full");       
    }
    
    public void getBookIdx(int i){
        for(int j=0;j<=jumlahBuku;j++) {
            if(booklist[j]!=null){
                System.out.println("judul : "+booklist[j].getJudul());
                System.out.println("kondisi : "+booklist[j].getKondisi());
                System.out.println("Status : "+booklist[j].getKondisi());
            }
            else {
                System.out.println("Buku tidak ditemukan");
            }
        } 
    }
    
    public void getBookKode(long i){
        for(int j=0;j<=jumlahBuku;j++) {
            if(booklist[j].getKode() == i){
                System.out.println("judul : "+booklist[j].getJudul());
                System.out.println("kondisi : "+booklist[j].getKondisi());
                System.out.println("Status : "+booklist[j].getKondisi());
            }
            else {
                System.out.println("Buku tidak ditemukan");
            }
        } 
    }   
    
    public void removeBookIdx(int i){//remove by index
        for(int j=0;j<=jumlahBuku;j++) {
            if(booklist[j]!=null){
                booklist[j]=null;
                System.out.println("Buku berhasil dihapus");
            }
            else {
                System.out.println("Buku tidak ditemukan");
            }
        }
    }
    
    public void removeBookKode(long i){//remove book by kode
        for(int j=0;j<=jumlahBuku;j++) {
            if(booklist[j].getKode() == i){
                booklist[j]=null;
            }
            else{
                System.out.println("Buku tidak ditemukan");
            }
        }
    }
    
    public String toString(){
        String x = "Judul = " + this.getJudul() +
                   "\nPenerbit = " + this.getPenerbit() +
                   "\nKondisi = " + this.getKondisi() +
                   "\nStatus = " + this.getStatus() +
                   "\nKode = " + this.getKode();
               
        return x;
    }
}
