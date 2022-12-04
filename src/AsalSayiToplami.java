import java.util.ArrayList;
import java.util.List;

public class AsalSayiToplami {

    public static void main(String[] args) {

        // 1'den 100'e kadar olan asal sayilar toplamini yazdirin

        int asalToplami=0;
        List<Integer> asallar=new ArrayList<>();
        asallar.add(2);
        asallar.add(3);
        asallar.add(5);
        asallar.add(7);

        for (int i = 2; i <100; i++) {
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
