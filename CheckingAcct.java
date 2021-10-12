public class CheckingAcct extends BankAcct{

    // keep track of transaction account

    private int transactioncount;

    private static final  int FEE_TRANSACTION = 3;
    private  static final double TRANSACTION_FEE = 2.0;

    // inherit balance, withdraw function, deposit function, getbalance function, set balance function
    // from bankacct
    // balance is private so is not directly accessible

    // take in initial balance
    public CheckingAcct(double initialBalance){

        // invoke constructor from BankAcct that takes in one value (initialBalance)
        super(initialBalance);
        transactioncount = 0;
    }

    @Override
    // take deposit function from super class an change its functionality in subclass
    public void deposit(double amount){

        // modification is seen when we update the transaction count
        transactioncount++;
        // calling super.deposit will perform the same task seen in super class
        // now we add the amount taken here to the bank account balance
        super.deposit(amount);
    }

    @Override
    public void withdraw( double amount){
        transactioncount++;
        // now we subtract the amount taken here from the bank account balance
        super.withdraw(amount);
    }

    // additional characteristics for checking method
    // deduct fees whenever transaction account is greater than the minimum number of transactions allowed
    // charge the transaction fee to the account

    public void deductFees(){
        if (transactioncount > FEE_TRANSACTION){
            double fee = TRANSACTION_FEE * (transactioncount -FEE_TRANSACTION );
            // apply fee to the bank account
            super.withdraw(fee);
        }
        transactioncount = 0;

    }

}
