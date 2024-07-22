package Bank;

public class BankMain {
    public static void main(String[] args) {
        Account customer1 = new Account(); // Create an account object
        customer1.deposite(500.0);

        // Create customer 2
        Account customer2 = new Account(); 
        customer2.deposite(100.0);

        System.out.print("Customer one has a balance of ");
        System.out.println(customer1.getBalance());
        System.out.print("Customer two has a balance of ");
        System.out.println(customer2.getBalance());
    }
}