package bankApplication;

import java.math.BigDecimal;
import java.util.Objects;


public abstract class BankAccount {

    String name;
    BigDecimal balance;
    double percent;
    String accountNumber;

    public BankAccount(String name, BigDecimal balance, double percent, String accountNumber) {
        this.name = name;
        this.balance = balance;
        this.percent = percent;
        this.accountNumber = accountNumber;
    }


    abstract void topUp(BigDecimal amount);

    abstract void withdraw(BigDecimal amount);

    abstract void applyPercents();

    abstract void sendMoneyAnotherAccounts(BankAccount anotherAccount, BigDecimal money);

    public BigDecimal getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setPercents(double percents) {

    }

//    public void sendMoneyAnotherAccounts(BankAccount anotherAccount, BigDecimal money) {
//
//        if (0 >= balance.subtract(money).intValue()) {
//            System.out.println("No enough money");
//        } else {
//            anotherAccount.topUp(money);
//            this.withdraw(money);
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;

        BankAccount that = (BankAccount) o;

        if (Double.compare(that.percent, percent) != 0) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (getBalance() != null ? !getBalance().equals(that.getBalance()) : that.getBalance() != null) return false;
        return getAccountNumber() != null ? getAccountNumber().equals(that.getAccountNumber()) : that.getAccountNumber() == null;
    }

    @Override
    public int hashCode() {
        int result;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (getBalance() != null ? getBalance().hashCode() : 0);
        long temp = Double.doubleToLongBits(percent);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getAccountNumber() != null ? getAccountNumber().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", percent=" + percent +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

}

