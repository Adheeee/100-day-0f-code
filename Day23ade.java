import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		 int [] data = { 1,78,65,7,0,9};
        for(int i: data){
            System.out.print(i+",");
            i++;
        }
        System.out.println("hasil awal");
        System.out.println();
        Arrays.sort(data,2,4);
        for(int i : data){
            System.out.print(i+",");
            i++;
        }
        System.out.println("hasil ke dua");
    }
    
}
	
