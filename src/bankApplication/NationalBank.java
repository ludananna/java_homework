package bankApplication;

import java.util.HashMap;
import java.util.Map;

public class NationalBank {

    private static NationalBank instance;
    private Map<String, Bank> banks;


    private NationalBank() {
        banks = new HashMap<>();
    }

    public static NationalBank getInstance() {
        if (instance == null) {
            System.out.println("Creating NatBank");
            instance = new NationalBank();
        }
        return instance;
    }

    public Bank getBank(String name) throws BankNotFoundException {
        if (banks.get(name) == null) {
            throw new BankNotFoundException("Such a bank is not in the catalog");
        }
        return banks.get(name);
    }

    private void registerBank(Bank bank) {
        banks.put(bank.getName(), bank);
    }

    @Override
    public String toString() {
        return "NationalBank{" +
                "banks=" + banks +
                '}';
    }

    public Map<String, Bank> getBanks() {
        return banks;
    }

    public void setBanks(Map<String, Bank> banks) {
        this.banks = banks;
    }
}
