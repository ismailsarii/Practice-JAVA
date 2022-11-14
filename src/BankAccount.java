public class BankAccount {

    private String cardNo;
    private String password;
    private double balance;

    public BankAccount(String cardNo, String password, double initialBalance) {
        this.cardNo = cardNo;
        this.password = password;
        this.balance = initialBalance;
    }

    public void withdraw(double amount){
        if(amount <= this.balance){
            this.balance -= amount;
        } else {
            System.out.println("You can not withdraw grater than your amount!!!");
        }


    }
    public void deposit(double amount){
        this.balance += amount;
    }

    public void sendMoney(String iban, double amount){
        if (amount<=this.balance){
            this.balance -= amount;
        }
    }

    public boolean isIbanValid(String iban){
        return iban.startsWith("TR")&&iban.length()==26;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "cardNo='" + cardNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}