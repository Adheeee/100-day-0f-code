import java.util.Scanner;
public class Day29ade{
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       int angka = sc.nextInt();
       if (angka > 20){
           System.out.println("angka lebih besar dari 20");
       } else{
           System.out.println("angka lebih kecil dari 20");
       }
   }
}