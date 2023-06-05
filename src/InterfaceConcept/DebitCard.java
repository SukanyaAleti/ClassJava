package InterfaceConcept;

class DebitCard implements SavingsAccount, CheckingAccount {
    private double savingsBalance;
    private double checkingBalance;

    @Override
    public void deposit1(double amount) {
        savingsBalance += amount;
        System.out.println("Deposited $" + amount + " into Savings Account.");
    }

    @Override
    public void deposit2(double amount) {
        checkingBalance += amount;
        System.out.println("Deposited $" + amount + " into Checking Account.");
    }

    public void displayBalances() {
        System.out.println("Savings Account Balance: $" + savingsBalance);
        System.out.println("Checking Account Balance: $" + checkingBalance);
    }
}
