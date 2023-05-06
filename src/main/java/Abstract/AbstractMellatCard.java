package Abstract;

public class AbstractMellatCard extends AbstractCreditCard{
private String digits;

    public AbstractMellatCard(String digits) {
        this.digits = digits;
    }

    @Override
    protected Boolean isValidPrefix() {
        System.out.println(this.digits.substring(0,4));
        if (this.digits.substring(0,4).equals("6104"))
        {

            System.out.println("your prefix are ok!");
            return true;
        }
        else return false;
    }

    @Override
    protected Boolean isNumOfDigitsValid() {
        if (this.digits.length()==16)
        {
            System.out.println("your digits are ok!");
            return true;
        }
        else return false;
    }
}
