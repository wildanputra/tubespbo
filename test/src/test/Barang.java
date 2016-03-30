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
    private String judul;
    private String kondisi;
    private String status;
    private long kode;
    private int jumlahBuku = 0;
    private Barang[] booklist;

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

    public Barang(String judul, String kondisi, String status,long kode){
        this.judul = judul;
        this.kondisi=kondisi;
        this.status=status;
        this.kode=kode;
    } 
    
    public void setbooklist(int n){ //menentukan jumlah buku dalam array
        booklist = new Barang[n];
    } 
    
    public void addBook(Barang b){
        if (jumlahBuku<booklist.length){
            booklist[jumlahBuku] = b;
            jumlahBuku++;
        }
        else System.out.println("Booklist full");       
    }
    
    public void getBookIdx(int i){
        //for(int j=0;j<=jumlahBuku;j++) {
            if(booklist[i]!=null){
                System.out.println("judul : "+booklist[i].getJudul());
                System.out.println("kondisi : "+booklist[i].getKondisi());
                System.out.println("Status : "+booklist[i].getKondisi());
            }
            else {
                System.out.println("Buku tidak ditemukan");
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
    
    public void removeBookIdx(int j){//remove by index
        //for(int j=0;j<=jumlahBuku;j++) {
            if(booklist[j]!=null){
                do{
                booklist[j]=booklist[j+1];
                j++;
                }while(j!=booklist.length);
                System.out.println("Buku berhasil dihapus");
            }
            else {
                System.out.println("Buku tidak ditemukan");
            }
        }
    
    public void removeBookKode(long i){//remove book by kode
        for(int j=0;j<=jumlahBuku;j++) {
            if(booklist[j].getKode() == i){
                do{
                booklist[j]=booklist[j+1];
                j++;
                }while(j!=booklist.length);
                System.out.println("Buku berhasil dihapus");
            }
            else{
                System.out.println("Buku tidak ditemukan");
            }
        }
    }
}
