import java.util.Scanner;

public class DortIslem_01 {


        /*
   Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
   dort islemden biri ile isleme koyup sonucunu yazdiriniz
     */

        public static void main (String[]args){

            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen iki tamsayi giriniz : ");
            int sayi1 = scan.nextInt();
            int sayi2 = scan.nextInt();

            System.out.println("Yapmak istediginiz islemi seciniz :" +
                    " \n\t1. Toplama\n\t2. Cikarma\n\t3. Carpma\n\t4. Bolme");

            int islem = scan.nextInt();

            // char islem2 = scan.next().charAt(0); ==> Kullanicidan char alma yolu

            if (islem == 1)
                System.out.println("Girdiginiz sayilarin toplami = " + (sayi1 + sayi2));
            else if (islem == 2)
                System.out.println("Girdiginiz sayilarin farki = " + (sayi1 - sayi2));
            else if (islem == 3)
                System.out.println("Girdiginiz sayilarin carpimi = " + (sayi1 * sayi2));
            else if (islem == 4)
                System.out.println("Girdiginiz sayilarin bolumu = " + (sayi1 / sayi2));
            else System.out.println("Hatali giris yaptiniz");

        }
    }