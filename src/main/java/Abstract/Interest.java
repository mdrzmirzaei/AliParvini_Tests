package Abstract;

public class Interest {
    public float Balance;

    public Interest(float balance) {
        Balance = balance;
    }


    public Boolean addInterest(float interest_rate) {
        if (interest_rate > 0) {
            Balance += (Balance * (interest_rate/ 100) );
            return true;
        } else
            return false;

    }
    public void printBalance(){
        System.out.println(Balance);
    }
}
