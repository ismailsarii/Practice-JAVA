public class WhilwLoopRakamlarTopla {
    public static void main(String[] args) {

        // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        rakamlarTopla(12345);
    }

    private static void rakamlarTopla(int sayi) {

        int toplam=0;
        while (sayi!=0){
            int birlerBasamagi=sayi%10;
            toplam+=birlerBasamagi;
            sayi=sayi/10;
        }
        System.out.println(toplam);

    }
}
