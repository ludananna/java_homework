package bankApplication;

import java.util.Map;

public class NationalBank {
    private Map<String, Bank> banks;

    public NationalBank(Map<String, Bank> banks) {
        this.banks = banks;
    }

    public Bank getBank(String name) {
        return banks.get(name);
    }


}
//        - Bank registration system, something like National Bank which:
//        * contains all registered banks
//        * can return Bank by name