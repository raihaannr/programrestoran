/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;
import java.util.Scanner;
/**
 *
 * @author raiha
 */
public class Menu {
    // deklarasi atribut
    public String makanan;
    public String minuman;
    public int harga;
    public int kodeMenu;
    
    // deklarasi konstruktor
    public Menu(String makanan, String minuman, int harga){
        this.makanan = makanan;
        this.minuman = minuman;
        this.harga = harga;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getKodeMenu() {
        return kodeMenu;
    }

    public void setKodeMenu(int kodeMenu) {
        this.kodeMenu = kodeMenu;
    }

     // deklarasi method lainnya
    public void menampilkanMenu(){
        System.out.println("\n Kode menu " + kodeMenu + " berupa " + makanan + " dan " + minuman + "\n");
    }
    
    // deklarasi method lainnya
    public void menampilkanHarga(){
        System.out.println("Kode menu " + kodeMenu + " Rp." + harga + "\n");
    }
    
}
    
