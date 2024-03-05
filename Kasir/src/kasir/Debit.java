package kasir;

public class Debit extends Cash{
    Debit (double hargaAwal){
        super(hargaAwal);
        this.hargaAwal += 2000; //pajak admin
        setpajak(hargaAwal*0.15); //set pajak 15%
    }
    
    void diskon() {
    hargaAwal -= hargaAwal*0.1; //diskon 10%
    }
}


