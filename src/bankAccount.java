public class bankAccount{
        private double balance;
        public bankAccount(double amount){
            balance = amount;
        }
        public void withdraw(double amount) throws InsufficientFundsException {
            if(balance<amount){
                throw new InsufficientFundsException(amount);
            }
            balance -= amount;
        }


}