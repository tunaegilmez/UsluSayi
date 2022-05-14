import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi , ust , sonuc = 1 ;

        Scanner scn = new Scanner(System.in);

        System.out.print("Sayi : ");
        sayi = scn.nextInt();
        System.out.print("Üst : ");
        ust = scn.nextInt();

        int i = 1 ;
        while (i <= ust){
            sonuc *= sayi ;
            i++;
        }

        System.out.println("Sonuc : "+ sonuc);
    }
}
