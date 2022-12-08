import java.util.Scanner;

public class SayininUssunuHesapla {
    public static void main(String[] args) {

// Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.


        ussunuHesapla();
    }

    public static void ussunuHesapla() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi=scan.nextInt();
        System.out.println("Lutfen istediginiz sayi ussu'nu giriniz");
        int girilenUs=scan.nextInt();
        int sonuc=1;
        for (int i = 1; i <=girilenUs ; i++) {
            sonuc*=girilenSayi;
        }
        System.out.println(sonuc);

    }
}
