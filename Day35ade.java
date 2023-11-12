
import java.util.Scanner;

public class Day35ade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        String hasil = angkaPembagian(angka);

        System.out.println(hasil);

        sc.close();
    }

    public static String angkaPembagian(int angka) {
        boolean hasil1 = angka % 3 == 0;
        boolean hasil2 = angka % 5 == 0;

        if (hasil1 && hasil2) {
            return "kiw kiw cukurkuk kukkru";
        } else if (hasil1) {
            return "kiw kiw";
        } else if (hasil2) {
            return "cukurkuk";
        } else {
            return Integer.toString(angka);
        }
    }

}
