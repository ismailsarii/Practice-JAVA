import java.util.Scanner;

public class UcakBileti_02 {
    public static void main(String[] args) {

     /*  A şehrinden uçmak isteyen bir kişi B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
        km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat %50 indirim 12 ve 24
        yas arasindaysa 10% 65 yasindan buyukse 30% gidis donus alirsa20% bu
        kosullara gore yolcudan gideceği mesafeyi isteyip ucak biletini hesaplayan program*/

    float B = 500;
    float C = 700;
    float D = 900;
    int  yas=0;
    double ucret=0;
    int yon;


    Scanner scan = new Scanner(System.in);
        System.out.println("yasinizi girin");
    yas = scan.nextInt();
        System.out.println("gidilecek yolu girin km");
    int yol = scan.nextInt();
        System.out.println("biletiniz tek yon ise 1, cift yon ise 2 girin");
    yon = scan.nextInt();

        if (yas<12){

        ucret = yol*0.10*0.5;

    } else if (yas<24) {
        ucret=yol*0.10*0.10;


    } else if (yas>64) {
        ucret=yol*0.10*0.30;

    }
        if (!(yon ==1 || yon == 2)) {
        System.out.println("hatalı giris");

    } else if (yon ==1 ) {
        System.out.println("ucret = "+ ucret);

    }else {
        System.out.println("ucret = "+ ucret*0.20);
    }
}
}