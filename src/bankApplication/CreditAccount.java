package bankApplication;

public class CreditAccount extends BankAccount {
    int creditLimit;

    public CreditAccount(String name, int balance, double percent, String accountNumber, int creditLimit) {
        super(name, balance, percent, accountNumber);
        this.creditLimit = creditLimit;
    }

    @Override
    void topUp(int amount) {
        balance = balance + amount;
    }

    @Override
    void withdraw(int amount) {
        if ((balance - amount) < creditLimit) {
            System.out.println("Credit's limit is " + creditLimit);
        } else {

            balance = balance - amount;
        }
    }

    @Override
    void applyPercents() {
        if (balance < 0) {
            balance = (balance + (balance * percent / 100));
        }
    }
}
