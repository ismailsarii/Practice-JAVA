package mapSoyisimYazdirMethod;

import java.util.HashMap;
import java.util.Map;

public class MapDepo {

    public static Map<Integer,String> ornekMapOlustur(){
        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-TM");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");


        return ogrenciMap;

    }

    public static String soyisimyazdir(Map<Integer, String> yeni,int key) {


        String yeni2=yeni.get(key).replaceFirst("-","1");
        yeni2=yeni2.replaceFirst("-","2");

        String soyisim=yeni2.substring(yeni2.indexOf("1") + 1, yeni2.indexOf("2"));
        return soyisim;
    }
}
