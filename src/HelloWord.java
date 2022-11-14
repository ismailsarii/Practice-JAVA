public class HelloWord {


        /*
    Konsolda :
    "Hello "\ / 'World'"
    yazdiriniz.
     */

    /*
	  \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
	          \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
	          \\  : Prints a back slash    : \  Ters slash yazdırır
	          \'  : Prints single quote    : '  Tek tırnak yazdırır.
	          \"  : Prints double quote    : "  Çift tırnak yazdırır.
	 */
    public static void main(String[] args) {

        System.out.println("\"Hello \"\\ / 'World'\"");
        System.out.println('\'');


        /*
        ************************************
                "ATM'ye Hosgeldiniz"

             1- Bakiye Sorgulama
             2- Para Yatirma
             3- Para Cekme
             4- Menu'den Cikis

        *************************************
         */

        System.out.println("************************************" +
                "\n\t\t\"ATM'ye Hosgeldiniz\"\n\n\t" +
                "1- Bakiye Sorgulama\n\t" +
                "2- Para Yatirma\n\t" +
                "3- Para Cekme\n\t" +
                "4- Menu'den Cikis\n\n" +
                "************************************");

        System.out.println(3 + 7);            // 10      matematiksel toplama
        System.out.println("ali" + "ayse"); // aliayse concatination

    }
}