public class Account {
    private double balance;

//    public Account(double balance) {
//        if (balance >= 0) {
//            this.balance = balance;
//        }
//    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        }
    }
}
