package InterfaceTest;

public class Switch {
    String cardNumber;
    Long amount;

    public Switch(String cardNumber, Long amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }


    boolean selectBank() {

        String cn = this.cardNumber.substring(0, 6);
        System.out.println(cn);

        switch (cn) {
            case "610433": {
                BankMellat bankmellat = new BankMellat(1000000L,"6104337308740719");
                bankmellat.withDtaw(this.cardNumber, this.amount);
                System.out.println("this is new Balance " + bankmellat.balance);
                return true;

            }

            case "603799":
                BankMelli bankMelli = new BankMelli();
                bankMelli.withDtaw(this.cardNumber, this.amount);
                return true;


            case "627353":
                BankTejarat bankTejarat = new BankTejarat();
                bankTejarat.withDtaw(this.cardNumber, this.amount);
                return true;
        }

        return false;
    }

}
