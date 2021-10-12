public class SavingAcct extends BankAcct {
    private double interestRate;

    // inherit balance, withdraw function, deposit function, getbalance function, set balance function
    // from bankacct
    // balance is private so is not directly accessible

    // build constructor for savingsacct to calculate interest rate

    public SavingAcct(double rate){
        interestRate = rate;
    }

    // adds interest to account balance
    public void addInterest(){
        double interest = getBalance() * interestRate / 100;

         // deposit gained interest into bankAcct
        deposit(interest);

    }
}

