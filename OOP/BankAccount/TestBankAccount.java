public class TestBankAccount {
    
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.depositMoney(5000.00, "checking");
        myAccount.depositMoney(20000.00, "savings");

        myAccount.getCheckingBalance();
        myAccount.getSavingsBalance();
        myAccount.getAccountNumber();
        myAccount.getAllAccountsTotalBalance();

        myAccount.withdrawMoney(200, "checking");
        myAccount.withdrawMoney(200, "savings");
        myAccount.withdrawMoney(200, "this should return 'Account not found. . .'");
        
        myAccount.getCheckingBalance();
        myAccount.getSavingsBalance();
        myAccount.getAllAccountsTotalBalance();
    }
}
