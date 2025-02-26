/**
 * @author David Sanchez
 */

public class BankAccount {
    private final int accountNumber;
    private double accountBalance;

    /**
     * The constructor should take an int for the account ID number. Bank accounts
     * should initially have a balance of zero.
     *
     * @param accountNumber account ID number.
     */

    protected BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Provide a getAccountNumber method to return the int account number.
     *
     * @return accountNumber account ID number
     */
    protected int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Provide a getBalance method to return the current account balance. This value
     * should be a double.
     *
     * @return accountBalance
     */
    protected double getBalance() {
        return accountBalance;
    }

    /**
     * • The class should have a deposit method that takes a double amount and adds
     * * it to the current account balance. This method returns nothing.
     * * If the amount attempted to deposit is negative, this method will throw an
     * * IllegalArgumentException. Since this is an *unchecked exception* type, your
     * * method does not need to explicitly state that it throws that type of exception
     *
     * @param depositAmount The amount deposited in the bank account.
     */
    protected void deposit(double depositAmount) {

        //throw allows you to create a custom error. Throw is used together with an exception type.
        if (depositAmount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative: " + depositAmount); //In this case IllegalArgumentException is the exception type
        } else {
            accountBalance += depositAmount;
        }

    }


    /**
     * The class should have a withdraw method that takes a double amount and subtracts it from the current account balance. This method returns nothing.
     * If the amount attempted to withdraw is greater than the current account balance,
     * this method will throw an InsufficientFundsException.
     * If the amount attempted to withdraw is negative, this method will throw an
     * IllegalArgumentException. Since this is an unchecked exception type, your
     * method does not need to explicitly state that it throws that type of exception
     *
     * @param withdrawalAmount The amount to withdraw from the total account balance.
     */
    protected void withdraw(double withdrawalAmount) throws InsufficientFundsException {
        if (withdrawalAmount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (withdrawalAmount > accountBalance) {
            throw new InsufficientFundsException(accountNumber - accountBalance); //needs throws in method signature
        }
        accountBalance -= withdrawalAmount;
    }
}
