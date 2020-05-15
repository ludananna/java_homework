package bankApplication;

public class ReachedCreditLimitException  extends Exception {
    public ReachedCreditLimitException (String r){
        super(r);
    }
}
