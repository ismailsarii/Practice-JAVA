import java.util.Scanner;

public class UcgenOlusturma01 {


        public static void main(String[] args) {


            /*                    0123*5678
                                     ***
                                    *****
                                   *******
                                  *********

             */
            Scanner scan =new Scanner(System.in);
            System.out.println("lütfen isim harf gir");
            String isim=scan.next();




            for (int i = 1; i <=39; i++) {
                if(i == 5 ) {
                    System.out.print(isim);
                } else if (i >= 10 && i <= 12) {
                    System.out.print(isim);
                } else if (i >= 16 && i <= 20) {
                    System.out.print(isim);
                } else if (i >= 23 && i <= 29) {
                    System.out.print(isim);
                } else if (i >= 31 && i <= 39) {
                    System.out.print(isim);
                } else if(i == 6 || i == 13 || i == 21 || i == 30 ){
                    System.out.print("\n");
                } else {
                    System.out.print(" ");
                }
            }}}