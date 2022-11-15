import java.util.ArrayList;
import java.util.List;

public class DegerArtir {
    public static void main(String[] args) {



    // Soru-2-Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
    //  Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)

    List<Integer> sayilar = new ArrayList<>();
        sayilar.add(12);
        sayilar.add(31);
        sayilar.add(7);
        sayilar.add(13);
        sayilar.add(10);
        System.out.println(sayilar);//[12, 31, 7, 13, 10]
    List<Integer> yeniSayilar = new ArrayList<>();

        for (int i : sayilar) {
        if( ! (i==7 || i== 10) ) {
            yeniSayilar.add(i+2);
        }else{
            yeniSayilar.add(i);
        }
    }
        System.out.println(yeniSayilar);

    }
}