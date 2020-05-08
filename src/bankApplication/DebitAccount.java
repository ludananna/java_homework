package bankApplication;

public class DebitAccount extends BankAccount {


    public DebitAccount(String name, int balance, int percent, String accountNumber) {
        super(name, balance, percent, accountNumber);
    }

    @Override
    void topUp(int amount) {
        balance = balance + amount;
    }

    @Override
    void withdraw(int amount) {
        if ((balance-amount) < 0) {
            System.out.println("No enough money");
        } else {
            balance = balance - amount;
        }
    }

    @Override
    void applyPercents() {
        if (balance > 0) {
            balance =  (balance+(balance*percent /100));
        }
    }
}

