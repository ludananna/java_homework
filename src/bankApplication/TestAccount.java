package bankApplication;

public class TestAccount {
    public static void main(String[] args) {


        BankAccount creditAccount = new CreditAccount("Millennium", 100, 4.0, "CA001", -1000);
        BankAccount debitAccount = new DebitAccount("Millennium", 100, 3.0, "DA001");


        creditAccount.topUp(300);
        creditAccount.withdraw(10);
        System.out.println("creditAccount = " + creditAccount);
        System.out.println("debitAccount = " + debitAccount);

        creditAccount.sendMoneyAnotherAccounts(debitAccount, 50);
        System.out.println("creditAccount = " + creditAccount);
        System.out.println("debitAccount = " + debitAccount);


        creditAccount.withdraw(500);
        System.out.println("creditAccount = " + creditAccount);

        creditAccount.applyPercents();
        System.out.println("creditAccount = " + creditAccount);

        debitAccount.applyPercents();
        System.out.println("debitAccount = " + debitAccount);

        debitAccount.sendMoneyAnotherAccounts(creditAccount,500);
        System.out.println("debitAccount = " + debitAccount);
        System.out.println("creditAccount = " + creditAccount);

        debitAccount.withdraw(500);
        System.out.println("debitAccount = " + debitAccount);

        creditAccount.withdraw(1000);
        System.out.println("creditAccount = " + creditAccount);

        creditAccount.sendMoneyAnotherAccounts(debitAccount,1000);
        System.out.println("creditAccount = " + creditAccount);

    }
}
