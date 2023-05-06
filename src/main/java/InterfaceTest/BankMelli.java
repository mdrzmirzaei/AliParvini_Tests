package InterfaceTest;

public class BankMelli extends Bank implements WithDrawInterface{
    public BankMelli() {

    }

    public BankMelli(Long balance, String cardNumber) {
        super(balance, cardNumber);
    }

    @Override
    public boolean withDtaw(String CardNumber, Long Amount) {
        return false;
    }

}
