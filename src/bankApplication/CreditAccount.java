package bankApplication;

import java.math.BigDecimal;

public class CreditAccount extends BankAccount {
    int creditLimit;

    public CreditAccount(String name, BigDecimal balance, double percent, String accountNumber, int creditLimit) {
        super(name, balance, percent, accountNumber);
        this.creditLimit = creditLimit;
    }

    @Override
    void topUp(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    void withdraw(BigDecimal amount) {
        if (balance.subtract(amount).intValue() < creditLimit) {
            System.out.println("Credit's limit is " + creditLimit);
        } else {
            balance = balance.subtract(amount);
        }
    }

    @Override
    void applyPercents() {
        if (balance.intValue() < 0) {
            balance = (balance.add(balance.multiply(BigDecimal.valueOf(percent)).divide(BigDecimal.valueOf(100.0))));
        }
    }

    @Override
    void sendMoneyAnotherAccounts(BankAccount anotherAccount, BigDecimal money) {
        if (creditLimit < balance.subtract(money).intValue()) {
            System.out.println("No enough money");
        } else {
            anotherAccount.topUp(money);
            this.withdraw(money);
        }
    }
}
