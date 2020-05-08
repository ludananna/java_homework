package bankApplication;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private String name;
    private Map<String, BankAccount> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public Bank(String name, Map<String, BankAccount> accounts) {
        this.name = name;
        this.accounts = accounts;
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

    public Map<String, BankAccount> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
