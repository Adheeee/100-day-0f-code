package day30ade;


public class Day30ade {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
         int n = sc.nextInt();
         
         for (int i = 0; i < n; i++) {
             for (int j = 0; j <= i; j++) {
                 System.out.print("x");
                 
             }
             System.out.println();
            
        }
    }

}
