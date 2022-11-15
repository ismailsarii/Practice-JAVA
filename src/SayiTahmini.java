import java.util.Random;
import java.util.Scanner;

public class SayiTahmini {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Random randomS = new Random();
        int sayi;
        int a = randomS.nextInt(100);
        //   System.out.println("a = " + a); // test amaçlıdır
        do {
            System.out.print("0 ile 100 arasında bir sayi tahmin ediniz: ");
            sayi = scan.nextInt();
            if (sayi < a) {
                System.out.println("daha büyük bir sayı giriniz :( ");
            } else if (sayi > a) {
                System.out.println("daha küçük bir sayı giriniz :)");
            }
        } while (!(a == sayi));
        System.out.println("****TEBRİKLER TAHMİNİNİZ DORU****");

    }
}