class Run implements Runnable{
    public void run(){
        for(int i = 0;i<5 ; i++){
            System.out.println("Running Thread: "+i);
        }
    }
}
public class M_Runnable{
    public static void main(String[] args) {
        Run obj = new Run();
        Thread t = new Thread(obj);
        t.start();
    }
}




