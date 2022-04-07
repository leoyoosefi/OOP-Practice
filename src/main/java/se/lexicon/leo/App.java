package se.lexicon.leo;

public class App {


    public static void main(String[] args) {

        Customer customer1 = new Customer("Leo Yoosefi", "leoyoosefi@gmail.com", "4563456345");
        BankAccount account1 = new BankAccount(customer1);
        System.out.println(account1.getAccountNumber());

        System.out.println(account1.getBalance());
        account1.deposit(2000);
        System.out.println(account1.getBalance());
        account1.withdraw(400);
        System.out.println(account1.getBalance());
        System.out.println(account1.getCustomer().getCustomerInformation());




    }
}