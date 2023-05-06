package InterfaceTest;

public abstract class Bank {
    Long balance;
    String cardNumber;

    public Bank() {
    }

    public Bank(Long balance, String cardNumber) {
        this.balance = balance;
        this.cardNumber = cardNumber;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }


}
