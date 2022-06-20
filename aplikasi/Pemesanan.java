/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

/**
 *
 * @author raiha
 */
public class Pemesanan {
    // deklarasi attribut
    public int noMeja;
    public String detailPesanan;
    public int pembayaran;
    
    // deklarasi konstruktor
    public Pemesanan(int noMeja, String detailPesanan, int pembayaran){
        this.noMeja = noMeja;
        this.detailPesanan = detailPesanan;
        this.pembayaran = pembayaran;
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

    @Override
    public String toString() {
        return "Pemesanan{" + "noMeja=" + noMeja + ", detailPesanan=" + detailPesanan 
                + ", pembayaran=" + pembayaran + '}';
    }
    
    // deklarasi method lainnya
    public void menampilkanStruk(){
        System.out.println(" struk Pemesanan kepada Pelanggan pada no meja " + noMeja 
        + " berupa " + detailPesanan + " dengan total harga " + "Rp." + pembayaran 
        + "\n");
    }
}
