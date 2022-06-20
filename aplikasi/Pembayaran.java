/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

/**
 *
 * @author raiha
 */
public class Pembayaran{
    // deklarasi attribut
    public int noMeja;
    public String menu;
    public int totalHarga;
    
    // deklarsi konstruktor
    public Pembayaran(int noMeja, String menu, int totalHarga){
        this.noMeja = noMeja;
        this.menu = menu;
        this.totalHarga = totalHarga;
    }

    public int getNoMeja() {
        return noMeja;
    }

    public void setNoMeja(int noMeja) {
        this.noMeja = noMeja;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    @Override
    public String toString() {
        return "Pembayaran{" + "noMeja=" + noMeja + ", menu=" + menu + ", totalHarga=" + totalHarga + '}';
    }

    // deklarasi method lainnya
    public void transaksi(){
        System.out.println("Pembayaran kepada Pelanggan pada no meja " + noMeja 
                + " berupa " + menu + " dengan total harga Rp." + totalHarga 
                + " sukses \n");
    }
}
