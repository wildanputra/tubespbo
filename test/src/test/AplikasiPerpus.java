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
    private String tmpUser;
    private int cekAnggotaApp;
    int tmpTgl,tmpBln,tmpThn, tmpAkhir1, tmpAkhir2;
    
    public AplikasiPerpus(){
        this.barang = new Barang();
        this.anggota= new Anggota();
        this.petugas = new Petugas();
        Petugas p1 = new Petugas("okaaryanata", "okaaryanata", "1301140220", "okaaryanata", "bali", "laki-laki");
        Petugas p2 = new Petugas("wildanputra", "wildanputra", "1301140210", "wildanputra", "bandung", "laki-laki");
        Petugas p3 = new Petugas("ariananggada", "ariananggada", "1301140400", "ariananggada", "bandung", "laki-laki");
        Barang b1 = new Barang("PBO", "robert", "Hilang satu halaman", "tersedia",121);
        Barang b2 = new Barang("COA", "minus", "Hilang dua halaman", "tersedia",122);
        Barang b3 = new Barang("RPL", "marcel", "Hilang satu halaman", "tersedia",123);
        Anggota a1 = new Anggota("robert", "robert", "123456", "robert", "laki", "balaendah", "FIF", "IF");
        this.barang.setBooklist(new Barang[200]);
        this.anggota.setDaftarAnggota(new Anggota[200]);
        this.petugas.setDaftarPetugas(new Petugas[50]);
        this.anggota.setPeminjaman(new Peminjaman[2]);
        //this.anggota.setPeminjaman(new Peminjaman[2]);
        this.barang.addBook(b1);
        this.barang.addBook(b2);
        this.barang.addBook(b3);
        this.petugas.addPetugas(p1);
        this.petugas.addPetugas(p2);
        this.petugas.addPetugas(p3);
        this.anggota.addAnggota(a1);
        System.out.println(this.anggota.getJumlahAnggota());
        System.out.println(this.petugas.getJumlahPetugas());
        System.out.println(this.barang.getJumlahBuku());
        System.out.println(this.barang.getBooklist(0).getJudul());
        System.out.println(this.barang.getBooklist(1).getJudul());
        System.out.println(this.barang.getBooklist(2).getJudul());
        System.out.println(this.barang.getBooklist(0).toString());
        System.out.println(this.anggota.d);
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
        System.out.println("");
        System.out.println(this.anggota.getDaftarAnggota(0).toString());
        this.menuPetugas();
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
        System.out.println("");
        this.menuPetugas();
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
        System.out.println("Login Anggota");
        System.out.print("Masukkan Username : ");
        String username = s.next();
        tmpUser = username;
        System.out.print("Masukkan Password : ");
        String password = s.next();
 
            for(int i=0;i<anggota.getJumlahAnggota(); i++){
                if(anggota.getDaftarAnggota(i).getUsername().equals(username) && anggota.getDaftarAnggota(i).getPassword().equals(password)){
                    this.menuAnggota();
                    //this.anggota.d=i;
                } else {
                    System.out.println("Username atau password salah");
                    System.out.println("Coba Lagi ? [Y/N] : ");
                    loop = s.next();
                    if(loop.equals("n")||loop.equals("N")){
                        this.menuLogin();
                    } else if(loop.equals("y")||loop.equals("Y")){
                        this.logAnggota();
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
        tmpUser = username;
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
        this.s = sc;
        int pil = 0;
        do{
            try{
                    System.out.println("Menu Petugas");
                    System.out.println("1. Pendaftaran");
                    System.out.println("2. Peminjaman Buku");
                    System.out.println("3. Pengembalian Buku");
                    System.out.println("4. Pengadaan Buku");
                    System.out.println("5. Lihat Buku");
                    System.out.println("6. Ubah Password");
                    System.out.println("7. Cek Anggota");
                    System.out.println("8. Logout");
                    System.out.print("Pilihan : ");
                    pil = s.nextInt();
                    switch(pil){
                                case 1:
                                this.menuPendaftaran();
                                case 2:
                                this.menuPinjam();
                                case 3:
                                this.menuKembali();
                                case 4:
                                this.menuPengadaan();
                                case 5:
                                this.menuLihatBuku();
                                System.out.println("masukan apapun untuk kembali");
                                String pilih = s.next();
                                if(pilih!=null){
                                    this.menuPetugas();
                                }
                                case 6:
                                this.menuUbahPassP();
                                case 7:
                                this.menuCekAnggota1();
                                case 8:
                                System.out.println("Terima kasih");
                                this.menuAwal();
                                default:
                                System.out.println("Input menu antara 1-7");
                            }
                }catch(InputMismatchException e){
                    System.out.println("Inputan harus angka");
                }finally{
                    Scanner scan = new Scanner(System.in);
                    this.s = scan;
                }
        }while(pil!=8);
    }
    
    public void menuPengadaan(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        System.out.println();
        System.out.println("Pengadaan Buku");
        System.out.print("Judul : ");
        String judul = s.next();
        System.out.print("Penerbit : ");
        String penerbit = s.next();
        System.out.print("Kondisi   : ");
        String kondisi = s.next();
        System.out.print("kode  : ");
        long kode = s.nextInt();
        System.out.print("Status   : ");
        String status = s.next();
        
        Barang b = new Barang(judul, penerbit, kondisi, status, kode);
        this.barang.addBook(b);
        System.out.println("Sukses");
    }
    
    public void menuCekAnggota1(){
        this.menuCekAnggota();
        this.menuCekAnggota1();
    }
    
    public void menuCekAnggota(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        int pil;
        String cek;
        System.out.println("1. username");
        System.out.println("2. nim");
        System.out.println("3. Kembali");
        System.out.println("Pilihan : ");
        pil = s.nextInt();
        switch(pil){
            case 1:
                System.out.println("Username : ");
                cek = s.next();
                this.anggota.getAnggotaUser(cek);
                if(this.anggota.c==true){
                    System.out.println("Anggota ditemukan");
                    this.cekAnggotaApp =1;
                } else {
                    this.cekAnggotaApp =0;
                    System.out.println("Anggota tidak ditemukan");
                }
            case 2 :
                System.out.println("NIM : ");
                cek = s.next();
                this.anggota.getAnggotaNim(cek);
                if(this.anggota.c==true){
                    System.out.println("Anggota ditemukan");
                    this.cekAnggotaApp =1;
                } else {
                    this.cekAnggotaApp =0;
                    System.out.println("anggota tidak ditemukan");
                }
            case 3 :
                this.menuPetugas();
            default:
                System.out.println("Masukan salah");
        }
    }
    
    public void menuPendaftaran(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        int pil;
        System.out.println("1. Anggota");
        System.out.println("2. Petugas");
        System.out.println("3. Kembali");
        System.out.println("Pilihan : ");
        pil = s.nextInt();
        switch(pil){
            case 1 :
                this.daftarAnggota();
            case 2 :
                this.daftarPetugas();
            case 3 :
                this.menuPetugas();
            default:
                System.out.println("masukan salah");
                this.menuPendaftaran();
        }
    }
    
    public void menuAnggota(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        int pil = 0;
        do{
            try{
                    System.out.println("Menu Anggota");
                    System.out.println("1. Lihat Peminjaman");
                    System.out.println("2. Ubah password");
                    System.out.println("3. Cari Buku");
                    System.out.println("4. Lihat Semua Buku");
                    System.out.println("5. Logout");
                    System.out.print("Pilihan : ");
                    pil = s.nextInt();
                    switch(pil){
                                case 1:
                                this.menuLihatPinjamA();
                                case 2:
                                this.menuUbahPassA();
                                case 3:
                                this.menuCariBukuA();
                                case 4:
                                this.menuLihatBuku();
                                System.out.println("masukan apapun untuk kembali");
                                String pilih = s.next();
                                if(pilih!=null){
                                    this.menuAnggota();
                                }
                                case 5:
                                System.out.println("Terima kasih");
                                this.menuAwal();
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
    
    public void menuLihatBuku(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        int pil ;
        System.out.println("Daftar Buku");
        for(int i=0;i<barang.getJumlahBuku();i++){
        System.out.println(i+1+". "+barang.getBooklist(i).getJudul());
        }
        System.out.println("Masukan nmr buku : ");
        pil = s.nextInt();
        System.out.println("===============");
        System.out.println("detail buku : ");
        System.out.println(barang.getBooklist(pil-1).toString());
        System.out.println("");
    }
    
    public void menuLihatPinjamA(){ //msdih kurang
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        this.anggota.getAnggotaUser(tmpUser);
        System.out.println("Daftar peminjman");
        for(int i=0; i<this.anggota.getDaftarAnggota(this.anggota.d).getJumlahPeminjaman();i++){
            if(this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i)!=null){
                System.out.println(this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i).toString());
                System.out.println("");
                String bla = s.next();
                this.menuAnggota();
            }
        }
            System.out.println("daftar peminjaman kosong");
              String bla = s.next();
              this.menuAnggota();
    }
        
    public void menuUbahPassA(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        String tmpPass,tmpPass1;
        int count=0;
        do{
            //System.out.println(this.anggota.d);
            System.out.println(tmpUser);
            this.anggota.getAnggotaUser(tmpUser);
            //System.out.println(this.anggota.d);
            this.anggota.getDaftarAnggota(this.anggota.d).getPassword();
            System.out.println("Ubah Password");
            System.out.println("");
            System.out.print("password lama : ");
            tmpPass = s.next();
            if(tmpPass.equals(this.anggota.getDaftarAnggota(this.anggota.d).getPassword())){
                System.out.print("Password baru : ");
                tmpPass = s.next();
                System.out.print("Ulang Password baru : ");
                tmpPass1 = s.next();
                if(tmpPass.equals(tmpPass1)){
                    this.anggota.getDaftarAnggota(this.anggota.d).setPassword(tmpPass1);
                    System.out.println("ganti password sukses !");
                    this.menuAnggota();
                } else{
                    System.out.println("Password tidak sama");
                    count++;
                }
            } else{
                System.out.println("Password salah");
                count++;
            }
        }while(count<3);
        this.menuAnggota();
    }
    
    public void menuCariBukuA(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        int pil;
        String x;
        String tmpJudul;
        long tmpKode;
        System.out.println("1. Judul");
        System.out.println("2. Kode");
        System.out.println("3. Kembali");
        System.out.print("Pilihan : ");
        pil = s.nextInt();
        switch(pil){
            case 1:
                System.out.println("Masukan judul : ");
                tmpJudul = s.next();
                this.barang.getBookJudul(tmpJudul);
                /*if(this.barang.getTmpCari()==1){
                    x = s.next();
                    if(x!=null){
                        this.menuCariBukuA();
                    }  
                }else{
                    this.menuCariBukuA();
                }*/
                this.menuCariBukuA();
            case 2:
                System.out.println("Masukan kode : ");
                tmpKode = s.nextInt();
                this.barang.getBookKode(tmpKode);
                this.menuCariBukuA();
            case 3:
                this.menuAnggota();
            default:
                this.menuCariBukuA();              
        }
    }
    
    public void menuCariBukuP(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        int pil;
        String x;
        String tmpJudul;
        long tmpKode;
        System.out.println("1. Judul");
        System.out.println("2. Kode");
        System.out.println("3. Kembali");
        pil = s.nextInt();
        switch(pil){
            case 1:
                System.out.println("Masukan judul : ");
                tmpJudul = s.next();
                this.barang.getBookJudul(tmpJudul);
                if(this.barang.getTmpCari()==1){
                    x = s.next();
                    if(x!=null){
                        this.menuCariBukuP();
                    }  
                }else{
                    this.menuCariBukuP();
                }
            case 2:
                System.out.println("Masukan kode : ");
                tmpKode = s.nextInt();
                this.barang.getBookKode(tmpKode);
                if(this.barang.getTmpCari()==1){
                    x = s.next();
                    if(x!=null){
                        this.menuCariBukuP();
                    }  
                }else{
                    this.menuCariBukuP();
                }
            case 3:
                this.menuPetugas();
            default:
                this.menuCariBukuP();              
        }
    }
    
    public void menuUbahPassP(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        String tmpPass,tmpPass1;
        int count=0;
        do{
            this.petugas.getPetugas(tmpUser);
            System.out.println("Ubah Password");
            System.out.println("");
            System.out.print("password lama : ");
            tmpPass = s.next();
            if(tmpPass.equals(this.petugas.getDaftarPetugas(this.petugas.d).getPassword())){
                System.out.print("Password baru : ");
                tmpPass = s.next();
                System.out.print("Ulang Password baru : ");
                tmpPass1 = s.next();
                if(tmpPass.equals(tmpPass1)){
                    this.petugas.getDaftarPetugas(this.petugas.d).setPassword(tmpPass1);
                    System.out.println("ganti password sukses !");
                    this.menuPetugas();
                } else{
                    System.out.println("Password tidak sama");
                    count++;
                }
            } else{
                System.out.println("Password salah");
                count++;
            }
        }while(count<3);
        this.menuPetugas();
    }
    
    public void menuPinjam(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        this.menuCekAnggota();
        if(this.cekAnggotaApp==1){
            System.out.println("1. view peminjaman");
            System.out.println("2. input peminjaman");
            System.out.println("3. Kembali");
            int pil = s.nextInt();
            if(pil==1){
                this.menuLihatPinjamP();
            } else if(pil == 2){
                this.menuInputPinjam();
            } else if(pil == 3){
                this.menuPetugas();
            } else{
                System.out.println("masukan salah");
                this.menuPinjam();
            }
        }
    }
    
    public void menuLihatPinjamP(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        System.out.println("Daftar peminjaman");
        for(int i=0;i<this.anggota.getDaftarAnggota(this.anggota.d).getJumlahPeminjaman();i++){
            if(this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i)!=null){
                System.out.println(this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i).toString());
                String bla = s.next();
                this.menuPetugas();
            } 
        }
                System.out.println("daftar peminjaman kosong");
                String bla = s.next();
                this.menuPetugas();
    }
    
    public void menuInputPinjam(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        System.out.println("kode buku : ");
        long kode = s.nextInt();
        this.barang.getBookKode(kode);
        if(this.barang.getIdxBuku()!=999){
            System.out.println("id pinjam = ");
            long idPeminjaman= s.nextInt();
            System.out.println("tgl pinjam : ");
            int tglPinjam = s.nextInt();
            System.out.println("bln pinjam : ");
            int blnPinjam = s.nextInt();
            System.out.println("thn pinjam : ");
            int thnPinjam = s.nextInt();
            
            Peminjaman p = new Peminjaman(idPeminjaman, this.barang.getBooklist(this.barang.getIdxBuku()), tglPinjam, blnPinjam, thnPinjam);
            this.anggota.getDaftarAnggota(this.anggota.d).addPeminjaman(p);
            System.out.println("SUKSES");
            menuPetugas();
        }
    }
    
    public void menuKembali(){
        Scanner sc = new Scanner(System.in);
        this.s = sc;
        int denda;
        System.out.println("Id peminjaman : ");
        long idPeminjaman = s.nextInt();
        System.out.println("NIM : ");
        String nim = s.next();
        this.anggota.getAnggotaNim(nim);
        for(int i=0; i<this.anggota.getJumlahPeminjaman();i++){
            if(this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i).getIdPeminjam()==idPeminjaman){
                System.out.println("tgl kembali : ");
                int tglKembali = s.nextInt();
                System.out.println("bln kembali : ");
                int blnKembali = s.nextInt();
                System.out.println("thn kembali : ");
                int thnKembali = s.nextInt();
                this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i).setTglKembali(tglKembali);
                this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i).setBlnKembali(blnKembali);
                this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i).setThnKembali(thnKembali);
                
                int thnPinjam = this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i).getThnPinjam();
                int blnPinjam = this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i).getBlnPinjam();
                int tglPinjam = this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i).getTglPinjam();
                
                /*hitDate(tglPinjam, , i)
                
                
                int thn = thnKembali - thnPinjam;
                int bln = blnKembali - blnPinjam;
                int tgl = tglKembali - tglPinjam;
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                if(thn==0 && bln==0 && tgl<=7){
                    denda = 0;
                    this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i).setDenda(denda);
                } else if(thn==0 && bln==0 && 7<tgl && tgl<=49){
                    denda = tgl * 1000;
                    this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i).setDenda(denda);
                }else if(thn==0 && bln==0 && tgl>49){
                    denda = 50000;
                    this.anggota.getDaftarAnggota(this.anggota.d).getPeminjaman(i).setDenda(denda);
                }else if(thn==0 && bln==0 && tgl>49){ 
                
                deletePinjam();
                menuPetugas();*/
                
                
                }
            }
        }
    }
    
    /*public int hitDate(int tgl, int bln, int thn ){
        
        if(thn % 4 == 0){
            switch(bln){
            case 1 :
                tmpTgl = 31;
            case 2 :
                tmpTgl = 29;
            case 3 :
                tmpTgl = 31;
            case 4 :
                tmpTgl = 30;
            case 5 :
                tmpTgl = 31;
            case 6 :
                tmpTgl = 30;
            case 7 :
                tmpTgl = 31;
            case 8 :
                tmpTgl = 31;
            case 9 :
                tmpTgl = 30;
            case 10 :
                tmpTgl = 31;
            case 11 :
                tmpTgl = 30;
            case 12 :
                tmpTgl = 31;
            }
        } else{ 
            switch(bln){
                case 1 :
                    tmpTgl = 31;
                case 2 :
                    tmpTgl = 28;
                case 3 :
                    tmpTgl = 31;
                case 4 :
                    tmpTgl = 30;
                case 5 :
                    tmpTgl = 31;
                case 6 :
                    tmpTgl = 30;
                case 7 :
                    tmpTgl = 31;
                case 8 :
                    tmpTgl = 31;
                case 9 :
                    tmpTgl = 30;
                case 10 :
                    tmpTgl = 31;
                case 11 :
                    tmpTgl = 30;
                case 12 :
                    tmpTgl = 31;
            }
        }
        tmpAkhir1 = tmpTgl-tgl;
        for(int i=1; i<bln; i++){
            tmpAkhir2 = tmpTgl + tmpAkhir2;
        }
        return tmpAkhir1;
    }*/

    

