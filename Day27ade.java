import java.util.Scanner ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("input nilai :");
		int data = sc.nextInt( );
		
		int i = 1;
		int Jumlah = 0;
		
		do{ 
		System.out.println(i);
		Jumlah += i ;
		i++;
		
	}while (i <= data);
	
	System.out.println(Jumlah);
}
}