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
