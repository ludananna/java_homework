package bankApplication;

public class NonSufficientFundsException extends Exception {
    public NonSufficientFundsException(String n) {
        super(n);
    }

}
