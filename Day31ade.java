
public class Day31ade {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("x");

            }
            System.out.println();

        }
        for (int i = n - 1; i  > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("x");
                
            }
            System.out.println();
            
        }
    }

}
