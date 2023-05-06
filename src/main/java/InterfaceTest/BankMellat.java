package InterfaceTest;

public class BankMellat extends Bank implements WithDrawInterface{

    public BankMellat() {
    }


    public BankMellat(Long balance, String cardNumber) {
        super(balance, cardNumber);
    }

    @Override
    public boolean withDtaw(String CardNumber, Long Amount) {
        try {
           super.setBalance(super.getBalance()+Amount);
            return true;
        }
        catch (Exception e )
        {
            System.out.println(e.getMessage());
            return false;
        }

    }

}
