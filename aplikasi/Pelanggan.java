/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

/**
 *
 * @author raiha
 */
public class Pelanggan extends Restoran {
    // deklarasi attribut
    public int noMeja;
    public String detailPesanan;
    public int pembayaran;
    
    // deklarasi konstruktor
    public Pelanggan(int id, String nama, String alamat){
        super(id, nama, alamat);
    }

    public int getNoMeja() {
        return noMeja;
    }

    public void setNoMeja(int noMeja) {
        this.noMeja = noMeja;
    }

    public String getDetailPesanan() {
        return detailPesanan;
    }

    public void setDetailPesanan(String detailPesanan) {
        this.detailPesanan = detailPesanan;
    }

    public int getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(int pembayaran) {
        this.pembayaran = pembayaran;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Pelanggan{" + "noMeja=" + noMeja + ", detailPesanan=" + detailPesanan + ", pembayaran=" + pembayaran + '}';
    }
    
    // deklarasi method lainnya
    public void melihatMenu(){
        System.out.println("Pelanggan atas nama : " + nama + "(" +id + ")" 
                + " No meja " + noMeja + " sedang melihat menu");
    }
    
    // deklarasi method lainnya
    public void pilihMenu(){
        System.out.println("Pelanggan atas nama : " + nama + "(" +id + ")" 
                + " No meja " + noMeja + " memilih menu berupa " + detailPesanan);
    }
    
    // deklarasi method lainnya
    public void bayarPesanan(){
        System.out.println("Pelanggan atas nama : " + nama + "(" +id + ")" 
                + "domisili tinggal "+ alamat + " No meja " + noMeja + " membayar pesanan sebesar " + pembayaran);
    }
}


