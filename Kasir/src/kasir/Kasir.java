package kasir;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        System.out.print("Masukkan total belanja : Rp");

        Scanner input = new Scanner(System.in);
        double total = input.nextDouble();
        System.out.println("Total belanja : Rp" + total);

        input.close();


        Cash pay[] = new Cash[3]; 
        pay[0] = new Cash(total); 
        pay[1] = new Kredit(total);
        pay[2] = new Debit(total);
        
        System.out.println();
        for (int i = 0; i < 3; i++) {
        System.out.println("Total belanja pelanggan " + (i+1) + " adalah " +
        pay[i].gettotalbayar());
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            pay[i].diskon();
            }
        
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("Total belanja pelanggan " + (i+1) + " sekarang adalah "+ pay[i].gettotalbayar());
            }
    }
  
}
