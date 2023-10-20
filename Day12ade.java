import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka :");
        int sb = sc.nextInt();
        int sum = sb;
        for(int i = sb; i > 0; i--){
            System.out.println(i);
             sum += i-1;
        }   
      
        System.out.println(sum);
        
	}
}