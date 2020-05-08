package bankApplication;

import java.util.HashMap;
import java.util.Map;

public class NationalBank {
    private Map<String, Bank> banks;


    public NationalBank() {
        banks = new HashMap<>();
    }

    public NationalBank(Map<String, Bank> banks) {
        this.banks = banks;
    }

    public Bank getBank(String name) {
        return banks.get(name);
    }

    public void registerBank(Bank bank){
        banks.put(bank.getName(), bank);
    }

    @Override
    public String toString() {
        return "NationalBank{" +
                "banks=" + banks +
                '}';
    }
}
