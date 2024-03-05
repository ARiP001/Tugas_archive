/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasir;

public class Cash {
    double hargaAwal;
    private double pajak;
    
    Cash(double total) {
    this.hargaAwal = total;
    pajak = hargaAwal*0.1; //pajak 10% harga total
    System.out.println("Harga mula-mula " + hargaAwal + " dan pajak standar (10%) " + pajak);
    }
    
    private double hitungpajak(double hargaAwal, double pajak) {
    return hargaAwal + pajak;
    }
    
    void diskon() {
    System.out.println("Beda metode beda total pembayaran");
    }
    
    void setpajak(double pajak) {
    this.pajak = pajak;
    }
    
    double gettotalbayar() {
    return hitungpajak(hargaAwal, pajak);
    }
}
