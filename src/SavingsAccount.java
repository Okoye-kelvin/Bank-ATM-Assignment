
public class  SavingsAccount extends Account {
    public static void withdraw(){
        Account.withdrawal();

        double CheckBalance;
        CheckBalance = Account_Balance.getAccountBalance() - Amount;
        System.out.println("Account Balance =" + CheckBalance);
    }
    public static void main(String[] args) {
        withdraw();


    }

}
