import java.util.ArrayList;

public class ListedenElemanSilme {

    public static void main(String[] args) {

        //Soru-3-Listede 15 veya 13 varsa, bu elemanları kaldırınız.
        //  Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)

        Integer [] arr= {10,31,15,13,54};
        ArrayList<Integer> ynarr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(!(ynarr.contains(15) || ynarr.contains(13))){
                ynarr.add(arr[i]);
            }
        }
        System.out.println(ynarr);//[10, 31, 15]
    }
}
