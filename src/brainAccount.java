public class brainAccount{

    public static void main(String[] args) {
        bankAccount obj = new bankAccount(10);
        try{
            obj.withdraw(11);
        }catch (InsufficientFundsException e){
            System.out.println("Error Found : "+e);
        }
    }

}