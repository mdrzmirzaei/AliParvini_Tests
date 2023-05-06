package InterfaceTest;

public class BankTejarat extends Bank implements WithDrawInterface{

    public BankTejarat() {
    }


    public BankTejarat(Long balance, String cardNumber) {
        super(balance, cardNumber);
    }

    @Override
    public boolean withDtaw(String CardNumber, Long Amount) {
        return false;
    }
}
