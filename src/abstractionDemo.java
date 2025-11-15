abstract class Abstraction {
    abstract void add();
    abstract void sub();
    abstract void mul();
}
class A extends Abstraction{
    int a = 12 , b = 6;
    public void add(){
        System.out.println("Addition:"+(a+b));
    }
    public void sub(){
        System.out.println("Substraction:"+(a-b));
    }
    public void mul(){
        System.out.println("multiplication:"+(a*b));
    }
}
public class abstractionDemo{
    public static void main(String[] args) {
        A obj = new A();
        obj.add();
        obj.sub();
        obj.mul();

    }
}