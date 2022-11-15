import java.util.Arrays;

public class ArrayinButunElemanlariniYazdir {
    public static void main(String[] args) {


        char[][] arr = new char[3][4];

        arr[0][0] = 'A';
        arr[0][1] = 'B';
        arr[0][2] = 'C';
        arr[0][3] = 'D';

        arr[1][0] = 'E';
        arr[1][1] = 'F';
        arr[1][2] = 'G';
        arr[1][3] = 'H';

        arr[2][0] = 'I';
        arr[2][1] = 'J';
        arr[2][2] = 'K';
        arr[2][3] = 'L';

        System.out.println(arr[1][2]);
        System.out.println(Arrays.toString(arr)); // Array'in icindeki arraylerin referanslarini verir =>[[C@e9e54c2, [C@65ab7765, [C@1b28cdfa]
        System.out.println(Arrays.deepToString(arr)); // Array'in icindeki arrayleri yazdirir. => [[A, B, C, D], [E, F, G, H], [I, J, K, L]]

        // Array'in butun elemanlarini altalta yazdirin
        for (int x = 0; x < arr.length; x++) {
            for (int o = 0; o < arr[x].length; o++) {
                System.out.println(arr[x][o]);
            }
        }

        // Array'in butun elemanlarini yanyana aralarinda bir boslukla yazdirin
        for (int x = 0; x < arr.length; x++) {
            for (int o = 0; o < arr[x].length; o++) {
                System.out.print(arr[x][o] + "-");
            }
        }

    }
}