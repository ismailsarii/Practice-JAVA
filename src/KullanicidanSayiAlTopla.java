import java.util.Scanner;

public class KullanicidanSayiAlTopla {
    public static void main(String[] args) {

        /*
          Kullanicidan toplanmak uzere sayi alin
          sayilarin toplami 500'e esit olur veya gecerse
          girilen sayi adedi,
          girilen sayilarin toplamini ve
          "Bu kadar yeter" yazdirin

            */
        Scanner scan = new Scanner(System.in);

        int sayi=0;
        int sayac =1;
        int toplam=0;
        String inci="inci";
        String inci2="ıncı";
        String uncu="üncü";


        while (toplam<=500){
            if (sayac==1 || sayac==2 || sayac==5 || sayac==7 || sayac==8 || sayac==6 || sayac%10==1 ||
                    sayac%10==2 || sayac%10==5 || sayac%10==7 || sayac%10==8 || sayac%10==6){
                System.out.println("Toplamak üzere "+ sayac + " " +inci+  " sayiyı giriniz");
            }
            if (sayac==3 || sayac==4 ||  sayac==9 || sayac==10 || sayac%10==3 ||sayac%10==4 || sayac%10==9 ||sayac%10==0){
                System.out.println("Toplamak üzere "+ sayac + " " +uncu+  " sayiyı giriniz");
            }
            sayi= scan.nextInt();
            sayac++;
            toplam+=sayi;
        }
        System.out.println("girilen sayi adedi: "+(sayac -1)+ " sayi toplami: "+toplam+
                "\nBu kadar yeter");
    }
}
