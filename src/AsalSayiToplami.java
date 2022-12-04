import java.util.ArrayList;
import java.util.List;

public class AsalSayiToplami {

    public static void main(String[] args) {

        // 1'den 100'e kadar olan asal sayilar toplamini yazdirin

        int asalToplami=16;
        List<Integer> asallar=new ArrayList<>();

        for (int i = 99; i >=1; i--) {
            if (i%2!=0 && i%3!=0 && i%7!=0 && i%5!=0){
                asallar.add(i);
            }
        }
        for (int i = 0; i <asallar.size() ; i++) {

            asalToplami+= asallar.get(i);

        }
        System.out.println("1'den 100'e kadar olan asal sayilar : "+ asallar);
        System.out.println("1'den 100'e kadar olan asal sayilar toplami: "+asalToplami);

    }
}