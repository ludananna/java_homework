package bankApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Bank {

    private String name;
    private Map<String, BankAccount> accounts;

    public Bank(String bankName) {
        this.name = bankName;
        accounts = new HashMap<>();
    }


    public Optional<BankAccount> getBankAccount(String name) {
        return Optional.ofNullable(accounts.get(name));
    }

//    public BankAccount getBankAccount(String accountNumber) throws AccountNotFoundException {
//        if (accounts.get(accountNumber) == null) {
//            throw new AccountNotFoundException("Such an account is not in the catalog");
//        }
//        return accounts.get(accountNumber);
//    }

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
