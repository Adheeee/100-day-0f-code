import java.util.Scanner ;
public class Day20ade {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("nilai : ");
        int nilai = sc.nextInt();
        
        if(nilai >= 95){
            System.out.println("Nilai : A ");
        }else if(nilai >= 85  ){
            System.out.println("Nilai : B ");
        }else if(nilai >= 75){
            System.out.println("Nilai : C ");
        }else if(nilai >= 65){
            System.out.println("Nilai : D ");
        }else if(nilai >= 55){
            System.out.println("Nilai : E ");
        }else{
            System.out.println("Error");
        }
    }
}
