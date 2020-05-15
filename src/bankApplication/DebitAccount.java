package bankApplication;

import java.math.BigDecimal;

public class DebitAccount extends BankAccount {


    public DebitAccount(String name, BigDecimal balance, double percent, String accountNumber) {
        super(name, balance, percent, accountNumber);
    }

    @Override
    void topUp(BigDecimal amount) {

    }

    @Override
    void withdraw(BigDecimal amount) throws NonSufficientFundsException {
        if (balance.subtract(amount).intValue() < 0) {
            throw  new  NonSufficientFundsException("Not enough money. Balance = " + balance);
        } else {
            balance = balance.subtract(amount);
        }
    }



    @Override
    void applyPercents() {
        if (balance.intValue() > 0) {
            balance = (balance.add(balance.multiply(BigDecimal.valueOf(percent)).divide(BigDecimal.valueOf(100.0))));
        }
    }

    @Override
    void sendMoneyAnotherAccounts(BankAccount anotherAccount, BigDecimal money) throws NonSufficientFundsException {
        if (0 >= balance.subtract(money).intValue()) {
            throw  new  NonSufficientFundsException("Not enough money. Balance = " + balance);
        } else {
            anotherAccount.topUp(money);
            this.withdraw(money);
        }
    }


}

