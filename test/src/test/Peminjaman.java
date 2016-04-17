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
    private long idPeminjam;
    private Barang brg;
    private String statusPeminjaman;
    private int tglPinjam,tglKembali, blnPinjam,blnKembali,thnPinjam,thnKembali,denda;

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }
    
    

    /**
     * @return the idPeminjam
     */
    public long getIdPeminjam() {
        return idPeminjam;
    }

    /**
     * @param idPeminjam the idPeminjam to set
     */
    public void setIdPeminjam(long idPeminjam) {
        this.idPeminjam = idPeminjam;
    }

    /**
     * @return the brg
     */
    public Barang getBrg() {
        return brg;
    }

    /**
     * @param brg the brg to set
     */
    public void setBrg(Barang brg) {
        this.brg = brg;
    }

    /**
     * @return the statusPeminjaman
     */
    public String getStatusPeminjaman() {
        return statusPeminjaman;
    }

    /**
     * @param statusPeminjaman the statusPeminjaman to set
     */
    public void setStatusPeminjaman(String statusPeminjaman) {
        this.statusPeminjaman = statusPeminjaman;
    }

    /**
     * @return the tglPinjam
     */
    public int getTglPinjam() {
        return tglPinjam;
    }

    /**
     * @param tglPinjam the tglPinjam to set
     */
    public void setTglPinjam(int tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    /**
     * @return the tglKembali
     */
    public int getTglKembali() {
        return tglKembali;
    }

    /**
     * @param tglKembali the tglKembali to set
     */
    public void setTglKembali(int tglKembali) {
        this.tglKembali = tglKembali;
    }

    /**
     * @return the blnPinjam
     */
    public int getBlnPinjam() {
        return blnPinjam;
    }

    /**
     * @param blnPinjam the blnPinjam to set
     */
    public void setBlnPinjam(int blnPinjam) {
        this.blnPinjam = blnPinjam;
    }

    /**
     * @return the blnKembali
     */
    public int getBlnKembali() {
        return blnKembali;
    }

    /**
     * @param blnKembali the blnKembali to set
     */
    public void setBlnKembali(int blnKembali) {
        this.blnKembali = blnKembali;
    }

    /**
     * @return the thnPinjam
     */
    public int getThnPinjam() {
        return thnPinjam;
    }

    /**
     * @param thnPinjam the thnPinjam to set
     */
    public void setThnPinjam(int thnPinjam) {
        this.thnPinjam = thnPinjam;
    }

    /**
     * @return the thnKembali
     */
    public int getThnKembali() {
        return thnKembali;
    }

    /**
     * @param thnKembali the thnKembali to set
     */
    public void setThnKembali(int thnKembali) {
        this.thnKembali = thnKembali;
    }

    public Peminjaman(long idPeminjam, Barang brg, int tglPinjam, int blnPinjam, int thnPinjam) {
        this.idPeminjam = idPeminjam;
        this.brg = brg;
        this.tglPinjam = tglPinjam;
        this.blnPinjam = blnPinjam;
        this.thnPinjam = thnPinjam;
    }

    public Peminjaman(long idPeminjam, Barang brg, String statusPeminjaman, int tglPinjam, int tglKembali, int blnPinjam, int blnKembali, int thnPinjam, int thnKembali) {
        this.idPeminjam = idPeminjam;
        this.brg = brg;
        this.statusPeminjaman = statusPeminjaman;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
        this.blnPinjam = blnPinjam;
        this.blnKembali = blnKembali;
        this.thnPinjam = thnPinjam;
        this.thnKembali = thnKembali;
    }
    
    
    
    
    /*public void getPinjamanIdx(int i) {
        for (int j = 0; j <= getjumlahPeminjaman(); j++) {
            if (Plist[j] != null) {
                System.out.println("ID : "+Plist[j].getidPeminjam());
                System.out.println("Status : "+Plist[j].getstatusPeminjaman());
                }
        }
    }*/
    

    
    @Override
    public String toString(){
        String x = "nID Peminjam = " + this.getIdPeminjam() +
                   "\ntgl pinjam = " + this.getTglPinjam()+"/"+
                    this.getBlnPinjam()+"/"+this.getThnPinjam() +
                   "\ntgl Kembali = " +this.getTglKembali()+"/"+this.getBlnKembali()+"/"+this.getThnKembali()+"/"+
                    "\nDenda = " + this.getDenda();
               
        return x;
    }
}
