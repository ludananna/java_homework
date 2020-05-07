package bankApplication;

public abstract class BankAccount {

    String name;
    double balance;
    double percent;
    String accountNumber;

    public BankAccount(String name, double balance, double percent, String accountNumber) {
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

    public void setPercents(double percents) {

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
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", percent=" + percent +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}


//    We are going to implement simple banking application.
//        We need to have the next:
//        - Account with possibility:
//        * top up
//        * withdraw
//        * setting percents
//        * apply percents on balance
//        * getting current balance
//        * getting account number
//        * sending money another accounts, including accounts from another banks

//        - Debit account:
//        * does not allow <0 balance
//        * apply percents on balance -> should increase balance on percents difference

//        - Credit account:
//        * has credit limit
//        * apply percents on balance -> in case of <0 balance should decrease it on percents difference

//        - Bank with next properties:
//        * name
//        * accounts
//        * Bank can return account by number

//        - Bank registration system, something like National Bank which:
//        * contains all registered banks
//        * can return Bank by name
