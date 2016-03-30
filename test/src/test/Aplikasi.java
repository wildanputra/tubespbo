package test;

/**
 *
 * @author OkaAryanata
 */
public class Aplikasi {
    Petugas[] daftarPetugas = new Petugas[20];
    Anggota[] daftarAnggota = new Anggota[100];
    Barang[] daftarBarang = new Barang[200];
    
    Petugas a ;
    Anggota b = new Anggota();
    boolean c; // check
    int d;
    Barang e ;
    
    public void addPetugas(Petugas p){
        if (a.getJumlahPetugas()<daftarPetugas.length){
            daftarPetugas[a.getJumlahPetugas()] = p;
            a.setJumlahPetugas(a.getJumlahPetugas()+1);
        }
        else System.out.println("Petugas sudah mencapai batas maksimal");       
    }
    
    public void getPetugas(String username){
        for(int j=0; j<=a.getJumlahPetugas();j++){
            if(daftarPetugas[j]!=null){
                if(daftarPetugas[j].getUsername()==username){
                    c = true;
                    d=j;
                }
                else { 
                    System.out.println("Petugas tidak ditemukan");
                    c = false;
                }
            }
            else {
                System.out.println("Daftar Petugas Kosong");
                c = false;
            }
        }
    }
    
    public void addAnggota(Anggota a){
        if (b.getJumlahAnggota()<daftarAnggota.length){
            daftarAnggota[b.getJumlahAnggota()] = a;
            b.setJumlahAnggota(b.getJumlahAnggota()+1);
        }
        else System.out.println("Anggota sudah penuh");
    }
    
    public void getAnggota(String username){
        for(int j=0; j<=b.getJumlahAnggota();j++){
            if(daftarAnggota[j]!=null){
                if(daftarAnggota[j].getUsername()==username){
                    c = true;
                    d=j;
                }
                else { 
                    System.out.println("Anggota tidak ditemukan");
                    c = false;
                }
            }
            else {
                System.out.println("Daftar Anggota Kosong");
                c = false;
            }
        }
    }
    
    public void deleteAnggota(String username){
        if (c ==true){
            do{
            daftarAnggota[d] = daftarAnggota[d+1];
            d++;
            }while(d!=daftarAnggota.length);
        }
    }
    
    
    
    
  
}