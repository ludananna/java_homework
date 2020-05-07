package bankApplication;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private String name;
    private Map<String, BankAccount> accounts;

    public BankAccount getBankAccount(String accountNumber) {
        return accounts.get(accountNumber);

    }

    public Bank() {
        accounts = new HashMap<>();
    }

    public Bank(String name, Map<String, BankAccount> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, BankAccount> accounts) {
        this.accounts = accounts;
    }
}
