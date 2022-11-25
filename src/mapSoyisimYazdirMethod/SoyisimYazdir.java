package mapSoyisimYazdirMethod;

import java.util.Map;

public class SoyisimYazdir {

    public static void main(String[] args) {

        Map<Integer,String> yeni = MapDepo.ornekMapOlustur();

        int ogrenciNo= 105;
        String soyisim=MapDepo.soyisimyazdir(yeni,ogrenciNo);

        System.out.println(ogrenciNo+"'lu ogrencinin soyismi : "+soyisim);


    }

}