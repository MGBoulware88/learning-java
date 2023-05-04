import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;
    //randomly generating acct#s, need to make sure they aren't repeated
    private static ArrayList<Integer> existingAccountNumbers = new ArrayList<Integer>();
    public static int numberOfAccounts = 0;
    public static double amountOfMoneyInAllAccounts = 0;

    public BankAccount() {
        numberOfAccounts++;
        setAccountNumber();
    }

    // G&S methods
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber() {
        String newAccountNumber = createAccountNumber();
        this.accountNumber = newAccountNumber;
    }

    public String depositMoney(double amountToDeposit, String targetAccount) {
        if (targetAccount.equals("checking")) {
            this.checkingBalance += amountToDeposit;
            BankAccount.amountOfMoneyInAllAccounts += amountToDeposit;
            return "Deposit into checking completed.";
        } else if (targetAccount.equals("savings")) {
            this.checkingBalance += amountToDeposit;
            BankAccount.amountOfMoneyInAllAccounts += amountToDeposit;
            return "Deposit into savings completed.";
        } else
            return "Account not found. Choose either 'checking' or 'savings' only.";
    }

    public String withdrawMoney(double amountToWithdraw, String targetAccount) {
        if (targetAccount.equals("checking") && this.checkingBalance >= amountToWithdraw) {
            this.checkingBalance -= amountToWithdraw;
            BankAccount.amountOfMoneyInAllAccounts -= amountToWithdraw;
            return "Withdrawal into checking completed.";
        } else if (targetAccount.equals("savings") && this.savingsBalance >= amountToWithdraw) {
            this.checkingBalance -= amountToWithdraw;
            BankAccount.amountOfMoneyInAllAccounts -= amountToWithdraw;
            return "Withdrawal into savings completed.";
        } else
            return "The selected account has insufficient funds to complete the withdrawal.\nChoose either 'checking' or 'savings' and make sure there are sufficient funds before trying again.";
    }

    public double getAllAccountsTotalBalance() {
            // should I be using the methods here?
        // return this.getCheckingBalance() + this.getSavingsBalance();
            // or just access the attributes because I can from this scope?
        return this.checkingBalance + this.savingsBalance; // this is probably cheaper and doesn't seem like a problem
    }

    //==============NINJA BONUS===================
    private String createAccountNumber() {
        //intialize a 10-sized int arr
        int[] newAccountNumber = new int[10];
        //instantiate randy as Random obj
        Random randy = new Random();
        for (int i=0; i<newAccountNumber.length; i++) {
            //get random num from 0-9
            int newInt = randy.nextInt(10);
            newAccountNumber[i] = newInt;
        }
        //stringify the arr to store as String in this.accountNumber
        String stringedAccountNumber = Arrays.toString(newAccountNumber);
        if (BankAccount.existingAccountNumbers.contains(stringedAccountNumber)) {
            return createAccountNumber();
        } else 
        return stringedAccountNumber;
    }

}