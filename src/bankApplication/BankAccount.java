package bankApplication;

public abstract class BankAccount {

    String name;
    int balance;
    int percent;
    String accountNumber;

    public BankAccount(String name, int balance, int percent, String accountNumber) {
        this.name = name;
        this.balance = balance;
        this.percent = percent;
        this.accountNumber = accountNumber;
    }


    abstract void topUp(int amount);

    abstract void withdraw(int amount);

    abstract void applyPercents();

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setPercents(int percents) {

    }

    public void sendMoneyAnotherAccounts(BankAccount anotherAccount, int money) {

        if ((balance - money) > 0) {
            anotherAccount.topUp(money);
            this.withdraw(money);
        } else {
            System.out.println("No enough money");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;

        BankAccount that = (BankAccount) o;

        if (getBalance() != that.getBalance()) return false;
        if (percent != that.percent) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return getAccountNumber() != null ? getAccountNumber().equals(that.getAccountNumber()) : that.getAccountNumber() == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = (int) (31 * result + getBalance());
        result = 31 * result + percent;
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

