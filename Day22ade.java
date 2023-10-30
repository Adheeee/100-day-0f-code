import java.util.Scanner ;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		//membuat sebuah array dengan 2 cara dan dengan 2 tipe data dan kapasitas array[5];
		int [ ]angka1 ={1,2,3,4,5};
		System.out.println(Arrays.toString(angka1));
		int[ ] angka2= new int[5];
		angka2[0]=1;
		angka2[1]=2;
		angka2[2]=3;
		angka2[3]=4;
		angka2[4]=5;
		System.out.println(angka2[3]);
	
		String[ ] nama=new String[5];
		nama[0] ="ade";
		nama[1] ="de";
		nama[2] ="ish";
		nama[3] ="he";
		nama[4] ="heho";	
		System.out.println(Arrays.toString(nama));
		
		String [ ] nama1= new String[ 5 ];
		Scanner input= new Scanner(System.in);
		for (int i =0; i <nama.length; i++){
		System.out.println("input yang ke:"+ i);
		nama[i]=input.nextLine();
		System.out.println(Arrays.toString(nama));
		
		for(String k : nama ){
			System.out.println(k);
		}
	
	}
	}
}