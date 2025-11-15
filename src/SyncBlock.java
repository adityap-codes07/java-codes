class Printer{
    void printDoc(String doc){
        synchronized(this){
            for(int i = 1 ; i < 4 ; i++){
                System.out.println(doc +" Page "+i);
            }
        }
    }
}
class ThreadA extends Thread{
    Printer p;
    ThreadA(Printer p) {
        this.p = p;
    }
    public void run() {
        p.printDoc("Document_A");
    }
}
class ThreadB extends Thread {
    Printer p;
    ThreadB(Printer p) {
        this.p = p;
    }
    public void run(){
        p.printDoc("Document_B");
    }
}
public class SyncBlock {
    public static void main(String[] args) {
        Printer  pr = new Printer();
        ThreadA t1 = new ThreadA(pr);
        ThreadB t2 = new ThreadB(pr);
        t1.start();
        t2.start();
    }
}
