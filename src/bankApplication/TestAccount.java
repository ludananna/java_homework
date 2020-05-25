package bankApplication;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class TestAccount {
    public static void main(String[] args) {

        BankAccount creditAccount = new CreditAccount("Millennium", BigDecimal.valueOf(100.0), 4.0, "CA001", -1000);
        BankAccount debitAccount = new DebitAccount("Millennium",  BigDecimal.valueOf(100.0), 3.0, "DA001");

        BankAccount accountCredit = new CreditAccount("Pekao", BigDecimal.valueOf(100.0), 3, "CA002", -1000);
        BankAccount accountDebit = new DebitAccount("Pekao", BigDecimal.valueOf(100.0), 2, "DA002");

        Bank millennium = new Bank("Millennium");
        millennium.registerAccount(creditAccount);
        millennium.registerAccount(debitAccount);

        Bank pekao = new Bank("Pekao");
        pekao.registerAccount(accountCredit);
        pekao.registerAccount(accountDebit);

        Map<String, Bank> bankNationalMap = new HashMap<>();
        bankNationalMap.put("Millennium", millennium);
        bankNationalMap.put("Pekao", pekao);

        NationalBank nationalBank = NationalBank.getInstance();
        nationalBank.setBanks(bankNationalMap);
        System.out.println("nationalBank = " + nationalBank);
        Bank bankMillennium = null;
        BankAccount accountMillennium = null;

        try {
            bankMillennium = nationalBank.getBank("Millennium").orElseThrow(() -> new BankNotFoundException("Such a bank is not in the catalog"));
        } catch (BankNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //      millennium.getBankAccount("CA001");
 //       millennium.getBankAccount("DA001");
 //       System.out.println("millennium = " + millennium);

        try {
            accountMillennium = bankMillennium.getBankAccount( "CA0").orElseThrow(() -> new AccountNotFoundException("Such an account is not in the catalog"));;
        } catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }

//        try {
//            debitAccount.withdraw(BigDecimal.valueOf(500.0));
//        } catch (NonSufficientFundsException | ReachedCreditLimitException e){
//            System.out.println(e.getMessage());
//        }
//        try {
//            creditAccount.withdraw(BigDecimal.valueOf(2000.0));
//        }catch (ReachedCreditLimitException | NonSufficientFundsException e){
//            System.out.println(e.getMessage());
//        }


//        nationalBank.getBank("Pekao");
//
//        Bank pekaoFromMap = nationalBank.getBank("Pekao");
//        System.out.println("pekaoFromMap = " + pekaoFromMap);

//        pekao.getBankAccount("CA002");
//        pekao.getBankAccount("DA002");
//        System.out.println("pekao = " + pekao);
//
//        creditAccount.topUp(BigDecimal.valueOf(300.));
//        creditAccount.withdraw(BigDecimal.valueOf(10.0));
//        System.out.println("creditAccount = " + creditAccount);
//        System.out.println("debitAccount = " + debitAccount);
//
//        creditAccount.sendMoneyAnotherAccounts(debitAccount, BigDecimal.valueOf(50.0));
//        System.out.println("creditAccount = " + creditAccount);
//        System.out.println("debitAccount = " + debitAccount);
//
//        creditAccount.withdraw(BigDecimal.valueOf(500.0));
//        System.out.println("creditAccount = " + creditAccount);
//
//        creditAccount.applyPercents();
//        System.out.println("creditAccount = " + creditAccount);
//
//        debitAccount.applyPercents();
//        System.out.println("debitAccount = " + debitAccount);
//
//        debitAccount.sendMoneyAnotherAccounts(creditAccount, BigDecimal.valueOf(500.0));
//        System.out.println("debitAccount = " + debitAccount);
//        System.out.println("creditAccount = " + creditAccount);
//
//        debitAccount.withdraw(BigDecimal.valueOf(500.0));
//        System.out.println("debitAccount = " + debitAccount);
//
//        creditAccount.withdraw(BigDecimal.valueOf(1000.0));
//        System.out.println("creditAccount = " + creditAccount);
//
//        creditAccount.sendMoneyAnotherAccounts(debitAccount, BigDecimal.valueOf(1000.0));
//        System.out.println("creditAccount = " + creditAccount);
//        System.out.println("debitAccount = " + debitAccount);

    }
}
