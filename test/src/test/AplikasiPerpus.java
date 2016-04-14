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
        /*System.out.println(barang.getBooklist(0).toString());
        System.out.println("====================");
        System.out.println(petugas.getDaftarPetugas(0).toString());
        System.out.println("====================");
        //System.out.println(anggota.getDaftarAnggota(2).toString());
        
        System.out.println("hello");
        //System.out.println(anggota.toString()); */
    }
    
    public void menuAwal(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        int log=0;
        do{
            try{
                System.out.println();
                System.out.println("Menu");
                System.out.println("1. Login");
                System.out.println("2. Exit");
                System.out.print("Input Menu : ");
                log = s.nextInt();
                switch(log){
                    case 1:
                    this.menuLogin();
                    case 2:
                    System.out.println("Terima kasih");
                    System.exit(0);
                    default:
                    System.out.println("Input menu antara 1-2");
                }
            }catch(InputMismatchException e){
                System.out.println("Inputan harus angka");
            }finally{
                Scanner scan = new Scanner(System.in);
                this.s = scan;
            }
        }while(log!=2);
    }
    
    public void menuDaftar(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        System.out.println();
        System.out.println("Daftar");
        System.out.println("1. Anggota");
        System.out.println("2. Petugas");
        System.out.println("3. Back");
        System.out.print("Input Menu : ");
        int log = s.nextInt();
        switch(log){
            case 1:
            this.daftarAnggota();
            case 2:
            this.daftarPetugas();
            case 3:
            this.menuAwal();
            default:
            System.out.println("Input menu antara 1-3");
        }
    }
    
    public void daftarAnggota(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        System.out.println();
        System.out.println("Daftar Anggota");
        System.out.print("Masukkan Username : ");
        String username = s.next();
        System.out.print("Masukkan Password : ");
        String password = s.next();
        System.out.print("Nama Anggota   : ");
        String nama = s.next();
        System.out.print("NIM  : ");
        String nim = s.next();
        System.out.print("Jenis Kelamin  : ");
        String kelamin = s.next();
        System.out.print("Alamat    : ");
        String alamat = s.next();
        System.out.print("Fakultas    : ");
        String fakultas = s.next();
        System.out.print("Jurusan    : ");
        String jurusan = s.next();
        
        Anggota a = new Anggota(username, password, nim, nama, kelamin, alamat, fakultas, jurusan);
        this.anggota.addAnggota(a);
        System.out.println("Sukses");
        this.menuLogin();
        //System.out.println(anggota.getDaftarAnggota(0).toString());
        
    }
    
    public void daftarPetugas(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        System.out.println();
        System.out.println("Daftar Petugas");
        System.out.print("Masukkan Username : ");
        String username = s.next();
        System.out.print("Masukkan Password : ");
        String password = s.next();
        System.out.print("Nama Petugas   : ");
        String nama = s.next();
        System.out.print("Jenis Kelamin  : ");
        String kelamin = s.next();
        System.out.print("Alamat    : ");
        String alamat = s.next();
        System.out.print("Nip    : ");
        String nip = s.next();
        
        Petugas p = new Petugas(username, password, nip, nama, alamat, kelamin);
        this.petugas.addPetugas(p);
        System.out.println("Sukses");
        this.menuLogin();
        //System.out.println(petugas.getDaftarPetugas(3).toString());
    }
    public void menuLogin(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        System.out.println();
        System.out.println("Login");
        System.out.println("1. Login Anggota");
        System.out.println("2. Login Petugas");
        System.out.println("3. Back");
        System.out.print("Input Menu : ");
        int log = s.nextInt();
        switch(log){
            case 1:
            this.logAnggota();
            case 2:
            this.logPetugas();
            case 3:
            this.menuAwal();
            default:
            System.out.println("Inputan salah");
        }
    }
    
    public void logAnggota(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        String loop;
        System.out.println();
        System.out.println("Login Petugas");
        System.out.print("Masukkan Username : ");
        String username = s.next();
        System.out.print("Masukkan Password : ");
        String password = s.next();
 
            for(int i=0;i<anggota.getJumlahAnggota(); i++){
                if(anggota.getDaftarAnggota(i).getUsername().equals(username) && anggota.getDaftarAnggota(i).getPassword().equals(password)){
                    this.menuAnggota();
                } else {
                    System.out.println("Username atau password salah");
                    System.out.println("Coba Lagi ? [Y/N] : ");
                    loop = s.next();
                    if(loop.equals("n")||loop.equals("N")){
                        this.menuLogin();
                    } else if(loop.equals("y")||loop.equals("Y")){
                        this.logPetugas();
                    } else {
                        System.out.println("Masukan tidak tepat");
                        this.menuAwal();
             
                    }
                }
            }
    }
  
    public void logPetugas(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        String loop;
        System.out.println();
        System.out.println("Login Petugas");
        System.out.print("Masukkan Username : ");
        String username = s.next();
        System.out.print("Masukkan Password : ");
        String password = s.next();
 
            for(int i=0;i<petugas.getJumlahPetugas(); i++){
                if(petugas.getDaftarPetugas(i).getUsername().equals(username) && petugas.getDaftarPetugas(i).getPassword().equals(password)){
                    this.menuPetugas();
                    System.out.println("SUKSES");
                } else {
                    System.out.println("Username atau password salah");
                    System.out.println("Coba Lagi ? [Y/N] : ");
                    loop = s.next();
                    if(loop.equals("n")||loop.equals("N")){
                        this.menuLogin();
                    } else if(loop.equals("y")||loop.equals("Y")){
                        this.logPetugas();
                    } else {
                        System.out.println("Masukan tidak tepat");
                        this.menuAwal();
             
                    }
                }
            }
    }
    
    public void menuPetugas(){
        Scanner sc = new Scanner(System.in);
        int pil = 0;
        do{
            try{
                    System.out.println("Menu Petugas");
                    System.out.println("1. Anggota");
                    System.out.println("2. Peminjaman Buku");
                    System.out.println("3. Pengembalian Buku");
                    System.out.println("4. Pengadaan Buku");
                    System.out.println("5. Lihat Buku");
                    System.out.println("6. Ubah Password");
                    System.out.println("7. Logout");
                    System.out.println("Pilihan : ");
                    pil = s.nextInt();
                    switch(pil){
                                case 1:
                                this.menuAU();
                                case 2:
                                this.menuPinjam();
                                case 3:
                                this.menuKembali();
                                case 4:
                                this.menuPengadaan();
                                case 5:
                                this.menuLihatBuku();
                                case 6:
                                this.menuUbahPassP();
                                case 7:
                                System.out.println("Terima kasih");
                                System.exit(0);
                                default:
                                System.out.println("Input menu antara 1-7");
                            }
                }catch(InputMismatchException e){
                    System.out.println("Inputan harus angka");
                }finally{
                    Scanner scan = new Scanner(System.in);
                    this.s = scan;
                }
        }while(pil!=7);
    }
    
    public void menuAnggota(){
        Scanner sc = new Scanner(System.in);
        int pil = 0;
        do{
            try{
                    System.out.println("Menu Anggota");
                    System.out.println("1. Lihat Peminjaman");
                    System.out.println("2. Ubah password");
                    System.out.println("3. Cari Buku");
                    System.out.println("4. Lihat Semua Buku");
                    System.out.println("5. Logout");
                    System.out.println("Pilihan : ");
                    pil = s.nextInt();
                    switch(pil){
                                case 1:
                                this.menuLihatBuku();
                                case 2:
                                this.menuUbahPassA();
                                case 3:
                                this.menuCariBuku();
                                case 4:
                                this.menuLihatBuku();
                                case 5:
                                System.out.println("Terima kasih");
                                System.exit(0);
                                default:
                                System.out.println("Input menu antara 1-5");
                            }
                }catch(InputMismatchException e){
                    System.out.println("Inputan harus angka");
                }finally{
                    Scanner scan = new Scanner(System.in);
                    this.s = scan;
                }
        }while(pil!=5);
    }
}
