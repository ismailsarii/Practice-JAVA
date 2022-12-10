import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KullanicidanIsimListesiMethod {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(isimleriDondur());
    }
    public static List<String> isimleriDondur() {
        List<String> isimListesi=new ArrayList<>();
        Scanner scan =new Scanner(System.in);
        String isim="";
        while (!isim.equalsIgnoreCase("Q")){
            System.out.println("lütfen bir isim giriniz+\nbitirmek icin Q'a basiniz");
            isim= scan.next();
            if (!isim.equalsIgnoreCase("Q"))
                isimListesi.add(isim);
        }return isimListesi;
    }
}
