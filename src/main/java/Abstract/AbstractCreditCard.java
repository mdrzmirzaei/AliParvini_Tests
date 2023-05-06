package Abstract;

public abstract class AbstractCreditCard {



    final boolean isValid(){
        if (isValidPrefix()==false)
        {
            System.out.println("your prefix is not valid");
            return false;
        }
        if ( isNumOfDigitsValid()==false)
        {
            System.out.println("your number of digits are not valid");
            return false;
        }

        return true;


    }

    protected abstract Boolean isValidPrefix();

    protected abstract Boolean isNumOfDigitsValid();
}
