import java.util.Scanner;

public class Atm {


        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("1212", "pass", 500);
            Scanner scanner = new Scanner(System.in);
            validateAccount(bankAccount, scanner);

            pickOption(bankAccount, scanner);
            System.out.println(bankAccount);
        }

        private static void pickOption(BankAccount bankAccount, Scanner scanner) {
            while (true) {
                System.out.println("Bir islem seciniz: ");
                System.out.println("\t1.Bakiye sorgulama\n\t2.Para yatirma\n\t3.Para Cekme\n\t4.Para Gonderme" + "\n\t5.Sifre Degistirme\n\t6.Cikis");
                String option = scanner.nextLine();
                switch (option) {
                    case "1":
                        System.out.println("Balance: " + bankAccount.getBalance());
                        break;
                    case "2":
                        System.out.println("Enter amount: ");
                        double amount = Integer.parseInt(scanner.nextLine());
                        bankAccount.deposit(amount);
                        break;
                    case "3":
                        System.out.println("Enter amount: ");
                        amount = Integer.parseInt(scanner.nextLine());
                        bankAccount.withdraw(amount);
                        break;
                    case "4":
                        System.out.println("Enter amount: ");
                        amount = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter iban: ");
                        String iban = scanner.nextLine();
                        if (bankAccount.isIbanValid(iban)) {
                            bankAccount.sendMoney(iban, amount);
                            break;
                        }
                        continue;
                    case "5":
                        System.out.println("Enter your current password");
                        String currentPass = scanner.nextLine();
                        System.out.println("Enter your new password");
                        String newPass = scanner.nextLine();
                        if (currentPass.equals(bankAccount.getPassword())) {
                            bankAccount.setPassword(newPass);
                        } else {
                            System.out.println("Sorry...Password does not match");
                        }
                    case "6":
                        break;
                }
                break;
            }
        }

        private static void validateAccount(BankAccount bankAccount, Scanner scanner) {
            while (true) {
                System.out.println("Enter Card no:");
                String no = scanner.nextLine();
                System.out.println("Enter Password:");
                String pass = scanner.nextLine();
                if (no.equals(bankAccount.getCardNo()) && pass.equals(bankAccount.getPassword())) break;
                if (no.replaceAll(" ", "").equals(bankAccount.getCardNo()) && pass.equals(bankAccount.getPassword())) break;
            }
        }
    }