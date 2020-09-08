public class Atm {

    private int initialbalance;
    private String pin;


    //Constructor
    public Atm(int initialBalance, String pin) {
        this.initialbalance = initialBalance;
        this.pin = pin;
    }

    public int getBalance() {
        return initialbalance;
    }

    public void deposit(int amountToDeposit) {
        //or can be written as follows: initialBalance += amountToDeposit;
        int initialBalance = amountToDeposit;

    }

    public void withdraw(int amountToWithdraw) {
        if (amountToWithdraw > initialbalance) {
            initialbalance -= 0;
        } else {
            //or can be written as follows: initialBalance -= amountToWithdraw;
            int initialBalance = amountToWithdraw;
        }
    }

    public boolean accessAccount(String userEnteredPin) {
        //this.pin = pin;
        if (userEnteredPin.equals(pin)) {
            return true;
        } else {
            return false;
        }

    }
}





