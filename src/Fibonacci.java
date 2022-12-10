import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan pozitif bir tamsayi alip,
        //         o tamsayidan kucuk Fibonacci sayilarini bir liste olarak
        //          yazdirin
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 .....


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        List<Integer> fibo=new ArrayList<>();
        fibo.add(0);
        fibo.add(1);

        for (int i = 0; fibo.get(i+1)+ fibo.get(i) <= sayi; i++) {

            fibo.add(i+2,fibo.get(i)+fibo.get(i+1));

        }
        System.out.println("Girilen sayidan kucuk fibonacci sayilari : "+fibo);

    }
}
