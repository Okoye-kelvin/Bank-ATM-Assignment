
    public class CurrentAccount extends Account {
        public CurrentAccount() {
        }

        public static void withdraw() {
            Account.withdrawal();
            System.out.println("Transaction Successful");
            double CheckBalance = Account_Balance.getAccountBalance() - Amount;
            System.out.println("Account Balance =" + CheckBalance);
        }

        public static void main(String[] args) {
            withdraw();
        }
    }


