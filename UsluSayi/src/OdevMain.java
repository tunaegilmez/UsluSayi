import java.util.Scanner;

public class OdevMain {
    public static void main(String[] args) {
        int sayi , ust , sonuc = 1 ;

        Scanner scn = new Scanner(System.in);

        System.out.println("Sayi : ");
        sayi = scn.nextInt();
        System.out.println("Üst : ");
        ust = scn.nextInt();

        for (int i = 1 ; i <= ust ; i++){
            sonuc *= sayi ;
        }
        System.out.println(sonuc);
    }
}
