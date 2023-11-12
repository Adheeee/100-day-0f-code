
import java.util.Scanner;

public class Day34ade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        int hasil1, hasil2;

        if (angka % 2 == 0) {
            hasil1 = angka + 2;
            System.out.println("Bilangan genap: " + hasil1);
        } else if (angka % 2 != 0) {
            hasil2 = angka + 1;
            System.out.print("Bilangan ganjil: " + hasil2);
        } else {
            System.out.println("false");
        }

    }
}
