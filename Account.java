package Bank;

public class Account {
    private double balance;

    // Set balance to 0.00
    public Account(){
        balance = 0.0;
    }
    // Deposit
    public void deposite(double amount){
        balance += amount;
    }
    // Widthdraw
    public void widthdraw(double amount){
        balance -= amount;
    }
    // Get balance
    public double getBalance(){
        return balance;
    }
}
