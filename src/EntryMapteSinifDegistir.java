import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapteSinifDegistir {

    public static void main(String[] args) {

        Map<Integer,String> map= new HashMap<>();
        map.put(101,"Ali-Can-10-H-MF");
        map.put(102,"Veli-Cem-11-M-Soz");
        map.put(103,"Ali-Cem-11-H-TM");
        map.put(104,"Ayse-Can-10-H-TM");
        map.put(105,"Ayse-Cem-11-M-TM");
        map.put(106,"Fatma-Han-10-K-Soz");



        // {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-H-TM, 104=Ayse-Can-10-H-TM, 105=Ayse-Cem-11-M-TM, 106=Fatma-Han-10-K-Soz}

        map.put(107,"Haydar-Kala-12-T-MF");

        Set<Map.Entry<Integer,String>> entry=map.entrySet();



        System.out.println(entry);

        String [] ogrenci;
        int sayac=0;



        for (Map.Entry<Integer,String> key: entry
        ) {


            ogrenci=key.getValue().split("-");

              /*
                [Ali, Can, 10, H, MF]
                [Veli, Cem, 11, M, Soz]
                [Ali, Cem, 11, H, TM]
                [Ayse, Can, 10, H, TM]
                [Ayse, Cem, 11, M, TM]
                [Fatma, Han, 10, K, Soz]
               */



            if (ogrenci[2].equals("12")){

                key.setValue("mezun oldu");

            }else {

                int sinif = Integer.parseInt(ogrenci[2]);
                sinif++;
                ogrenci[2]=sinif+"";

                key.setValue(   ogrenci[0]+"-"+
                        ogrenci[1]+"-"+
                        ogrenci[2]+"-"+
                        ogrenci[3]+"-"+
                        ogrenci[4]);

            }

        }
        System.out.println(entry);

    }

}