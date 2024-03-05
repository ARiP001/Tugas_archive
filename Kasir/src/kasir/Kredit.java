/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasir;

public class Kredit extends Cash{
    Kredit(double hargaAwal){
        super(hargaAwal);
        this.hargaAwal += 5000; //pajak admin
        setpajak(hargaAwal*0.25); //set pajak 25%
        }
    void diskon() {
    hargaAwal -= hargaAwal*0.1; //diskon 10%
    } 
}
