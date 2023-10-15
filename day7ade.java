
import java.util.Scanner;


public class day7ade {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("masukkan nilai: ");
        
        int nilai =sc.nextInt();
        if (nilai % 2 == 1){
            System.out.println("ini adalah angka ganjil");
    
        } else {
            System.out.println("ini adalah angka genap");
        }
        
    }
}
