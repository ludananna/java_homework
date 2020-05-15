package bankApplication;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private String name;
    private Map<String, BankAccount> accounts;

    public Bank(String bankName) {
        this.name = bankName;
        accounts = new HashMap<>();
    }

    public BankAccount getBankAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void registerAccount(BankAccount account){
        accounts.put(account.getAccountNumber(),account);
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
