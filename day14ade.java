import java.util.Scanner ;
public class Main {
	public static void main(String[] args) {
		int umur;
	Scanner masukkan=new Scanner(System.in);
	System.out.print(" umur adee:");
	umur=masukkan.nextInt();
	
	if (umur <= 20){
		System.out.println("anda lulus");
		
	}else{
		System.out.println("anda tidak lulus");
		}
	}
}