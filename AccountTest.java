public class AccountTest {
    public static void main(String[] args) {
        // establish a bank account that we will test
        // pass in the rate
        SavingAcct mySavings = new SavingAcct(0.5);

        // here we must intiliaze the amount of money that we will begin with in this specific checkings account
        CheckingAcct jozCheckings = new CheckingAcct(100);

        // we want to deposit 10000 into my savings
        // use the object that we just created to give it attributes
        mySavings.deposit(10000);

        // after depositing 10000, we want to transfer 2000 to joz's acct
        mySavings.transfer(2000, jozCheckings);

        jozCheckings.withdraw(1500);
        jozCheckings.withdraw(80);

        mySavings.transfer(1000, jozCheckings);
        jozCheckings.withdraw(400);

        // simulate end of month balance after all of the transactions
        mySavings.addInterest();
        jozCheckings.deductFees();

        System.out.println("my savings: " + mySavings.getBalance());

        System.out.println("expected: 7035");

        System.out.println("Joz balance: " + jozCheckings.getBalance());


    }
}
