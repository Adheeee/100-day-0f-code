import java.util.Scanner;
public class Day19ade {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("m :");
        int m = sc.nextInt();
        
        for (int i = m; i < 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.println(" * ");
                
            }
            System.out.println(" ");
            
        }
    }
}
