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
    void withdraw(BigDecimal amount) throws ReachedCreditLimitException{
        if (balance.subtract(amount).intValue() < creditLimit) {
            throw new ReachedCreditLimitException ("Your current balance = " + balance + " and credit limit =" + creditLimit);
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
    void sendMoneyAnotherAccounts(BankAccount anotherAccount, BigDecimal money) throws ReachedCreditLimitException{
        if (creditLimit < balance.subtract(money).intValue()) {
            throw new ReachedCreditLimitException ("Your current balance = " + balance + " and credit limit =" + creditLimit);
        } else {
            anotherAccount.topUp(money);
            this.withdraw(money);
        }
    }
}
