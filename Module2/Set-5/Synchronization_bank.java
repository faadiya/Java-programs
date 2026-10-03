class BankAccount {

    int balance = 1000;

    synchronized void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName()
                + " is trying to withdraw " + amount);

        if (balance >= amount) {
            balance = balance - amount;

            System.out.println(Thread.currentThread().getName()
                    + " withdrew " + amount);

            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName()
                    + " cannot withdraw. Insufficient balance");
        }
    }
}

class Customer extends Thread {

    BankAccount account;

    Customer(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    public void run() {
        account.withdraw(700);
    }
}

class Synchronization_bank {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account, "Customer 1");
        Customer c2 = new Customer(account, "Customer 2");

        c1.start();
        c2.start();
    }
}
