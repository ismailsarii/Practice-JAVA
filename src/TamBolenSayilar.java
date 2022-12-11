import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TamBolenSayilar {
    public static void main(String[] args) {
//Soru - Kullanicidan pozitif bir tamsayi alip,
        //        o tamsayiyi tam bolebilen tum pozitif tamsayilari
        //       bir liste olarak bize donduren bir method olusturun.

        System.out.println(tamBolenler());

    }

    public static List<Integer> tamBolenler() {
        List<Integer> bolen=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        int sayi=0;

        while (sayi<=0){
            System.out.println("lutfen pozitif bir tamsayi giriniz");
            sayi=scan.nextInt();
        }
        for (int i = 1; i <=sayi; i++) {
            if (sayi%i==0){
                bolen.add(i);
            }
        }

        return bolen;
    }
}