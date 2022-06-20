/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

/**
 *
 * @author raiha
 */
// deklarasi kelas
public class Restoran {
    
    // deklarasi attribut
    public int id;
    public String nama;
    public String alamat;
 
    // deklarasi konstruktor
    public Restoran(int id, String nama, String alamat){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
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
        return "Restoran{" + "id=" + id + ", nama=" + nama + ", alamat=" + alamat + '}';
    }
    
    // deklarasi method lainnya
    public void mencatatPesanan(){
        System.out.println("Pegawai atas nama : " + nama + "(" +id + ")" 
                + " tempat domisili tinggal " + alamat + " mencatat pesanan pembeli");
    }
    
    public void membuatPesanan(){
        System.out.println("Pegawai atas nama : " + nama + "(" +id + ")" 
                + " tempat domisili tinggal " + alamat + " mencatat pesanan pembeli");
    }

}
