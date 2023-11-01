import java.util.HashSet;
public class Main {
	public static void main(String[] args) {
		  HashSet<String> nimSet = new HashSet<String>();

        
        nimSet.add("123456");
        nimSet.add("234567");
        nimSet.add("345678");

        
        System.out.println("Data NIM Mahasiswa:");
        for (String nim : nimSet) {
            System.out.println(nim);
        }
    }
}
	