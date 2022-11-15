package kelimeOyunu;

import java.util.Scanner;

public class KelimeOyunu {

        static Oyuncu oyuncu1 = new Oyuncu("First");
        static Oyuncu oyuncu2 = new Oyuncu("Second");

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String kelime = kelimeGir(scanner, "Bir kelime giriniz: ");
            System.out.println(kelime);
            kabulEdiyorMusun(oyuncu2, kelime, scanner);
            System.out.println(kazananKim(oyuncu1, oyuncu2));
            System.out.println("-------sonuclar-----");
            System.out.println(oyuncu1.getName() + " : " + oyuncu1.getPuan());
            System.out.println(oyuncu2.getName() + " : " + oyuncu2.getPuan());
            System.out.println("--------------------");
        }

        private static String kelimeGir(Scanner scanner, String text) {
            System.out.print(text);
            return scanner.nextLine();
        }

        private static void kabulEdiyorMusun(Oyuncu oyuncu, String kelime, Scanner scanner) {
            String kabul = kelimeGir(scanner, "Kabul ediyor musun? Evet/Hayir: ");
            if (kabul.equalsIgnoreCase("Evet")) {
                if (oyuncu == oyuncu1) {
                    oyuncu1.puanArttir(puanHesapla(kelime));
                } else {
                    oyuncu2.puanArttir(puanHesapla(kelime));
                }
                devamEtmekIstiyorMusun(scanner, kelime, oyuncu);
            } else {
                System.out.print("gecersiz kelime.\nkazanan oyuncu: ");

            }
        }

        private static void devamEtmekIstiyorMusun(Scanner scanner, String kelime, Oyuncu oyuncu) {
            String devam = kelimeGir(scanner, "Devam etmek istiyor musun? Evet/Hayir: ");
            if (devam.equalsIgnoreCase("Evet")) {
                String kelimeEk = kelimeGir(scanner, "eklemek istedigin kelimeyi giriniz: ");
                String yer = kelimeGir(scanner, "basa mi sona mi? bas/son: ");
                if (yer.equalsIgnoreCase("bas")) {
                    kelime = kelimeEk + kelime;
                } else {
                    kelime += kelimeEk;
                }
                if (oyuncu == oyuncu2) {
                    kabulEdiyorMusun(oyuncu1, kelime, scanner);
                } else {
                    kabulEdiyorMusun(oyuncu2, kelime, scanner);
                }
            } else {
                System.out.println("Oyun bitti\n Kazanan: ");
                oyuncu.puanArttir(puanHesapla(kelime));
            }

        }

        private static int puanHesapla(String kelime) {
            return kelime.length();
        }

        private static Oyuncu kazananKim(Oyuncu oyuncu1, Oyuncu oyuncu2) {
            return oyuncu1.getPuan() > oyuncu2.getPuan() ? oyuncu1 : oyuncu2;
        }
    }