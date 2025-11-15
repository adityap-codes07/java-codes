public class InsufficientFundsException extends Exception{
    private double amount;
    public InsufficientFundsException(double amount){
        super("You don't have enough money");
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}