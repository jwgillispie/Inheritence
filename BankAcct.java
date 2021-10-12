public class BankAcct {

    // create a double variable that will hold the balance of our bank account
    private double balance;

    // default constructor to create the bankaccount with a initial balance of 0
    public BankAcct() { // take no argument
        balance = 0;
    }

    // parameterized constructor for creating a bank account with the initial balance given by the user
    public BankAcct(double initialBalance){ // prompts user to add initial balance (overloading constructor)
        balance = initialBalance;
    }

    // method for adding money (amount) to the bank account
    public void deposit(double amount){
        balance += amount;
    }

    // method for taking money (amount) away from the bank account
    public void withdraw (double amount){
        balance -= amount;
    }

    // method for retrieving the balance of the bank account
    public double getBalance(){ // retrieve value of the balance
        return balance;
    }

    // method for setting the balance to a new amount
    public void setBalance(double amount){
        balance = amount;
    }

    // transfer money from bank account to other bank account

    public void transfer (double amount, BankAcct other){ // amount of money that we want to transfer, bank where we transfer money to
        withdraw(amount); // taking amount of money from current bank account
        other.deposit(amount); // deposit amount into another bank account. defines bank acct super class
    }
}
