package mapSoyisimYazdirMethod;

import java.util.Map;

public class SoyisimYazdir {

    public static void main(String[] args) {

        Map<Integer,String> yeni = MapDepo.ornekMapOlustur();

        System.out.println(yeni);
        System.out.println(MapDepo.soyisimyazdir(yeni, 103));


    }

}