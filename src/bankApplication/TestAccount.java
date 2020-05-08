package bankApplication;

import java.util.HashMap;
import java.util.Map;

public class TestAccount {
    public static void main(String[] args) {

        BankAccount creditAccount = new CreditAccount("Millennium", 100, 4, "CA001", -1000);
        BankAccount debitAccount = new DebitAccount("Millennium", 100, 3, "DA001");

        Map<String, BankAccount> accountMillenniumMap = new HashMap<>();
        accountMillenniumMap.put("creditAccount", creditAccount);
        accountMillenniumMap.put("debitAccount", debitAccount);

        BankAccount accountCredit = new CreditAccount("Pekao", 100, 3, "CA002", -1000);
        BankAccount accountDebit = new DebitAccount("Pekao", 100, 2, "DA002");

        Map<String, BankAccount> accountPekaoMap = new HashMap<>();
        accountPekaoMap.put("accountCredit", accountCredit);
        accountPekaoMap.put("accountDebit", accountDebit);

        Bank millennium = new Bank("Millennium", accountMillenniumMap);
        Bank pekao = new Bank("Pekao", accountPekaoMap);

        Map<String, Bank> bankNationalMap = new HashMap<>();
        bankNationalMap.put("Millennium", millennium);
        bankNationalMap.put("Pekao", pekao);

        NationalBank nationalBank = new NationalBank(bankNationalMap);
        System.out.println("nationalBank = " + nationalBank);

        nationalBank.getBank("Millennium");
        millennium.getBankAccount("CA001");
        millennium.getBankAccount("DA001");
        System.out.println("millennium = " + millennium);


        nationalBank.getBank("Pekao");

        Bank pekaoFromMap = nationalBank.getBank("Pekao");
        System.out.println("pekaoFromMap = " + pekaoFromMap);

        pekao.getBankAccount("CA002");
        pekao.getBankAccount("DA002");
        System.out.println("pekao = " + pekao);



//        creditAccount.topUp(300);
//        creditAccount.withdraw(10);
//        System.out.println("creditAccount = " + creditAccount);
//        System.out.println("debitAccount = " + debitAccount);
//
//        creditAccount.sendMoneyAnotherAccounts(debitAccount, 50);
//        System.out.println("creditAccount = " + creditAccount);
//        System.out.println("debitAccount = " + debitAccount);
//
//        creditAccount.withdraw(500);
//        System.out.println("creditAccount = " + creditAccount);
//
//        creditAccount.applyPercents();
//        System.out.println("creditAccount = " + creditAccount);
//
//        debitAccount.applyPercents();
//        System.out.println("debitAccount = " + debitAccount);
//
//        debitAccount.sendMoneyAnotherAccounts(creditAccount, 500);
//        System.out.println("debitAccount = " + debitAccount);
//        System.out.println("creditAccount = " + creditAccount);
//
//        debitAccount.withdraw(500);
//        System.out.println("debitAccount = " + debitAccount);
//
//        creditAccount.withdraw(1000);
//        System.out.println("creditAccount = " + creditAccount);
//
//        creditAccount.sendMoneyAnotherAccounts(debitAccount, 1000);
//        System.out.println("creditAccount = " + creditAccount);

    }
}
