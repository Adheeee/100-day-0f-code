import java.util.HashSet;
public class Main {
	public static void main(String[] args) {
		HashSet<String> myHashSet = new HashSet<String>();

    myHashSet.add("Merah");
    myHashSet.add("Biru");
    myHashSet.add("Kuning");
    myHashSet.add("Merah");

    System.out.println("Elemen-elemen dalam HashSet: ");
    for (String color : myHashSet) {
      System.out.println(color);
    }
	}
}