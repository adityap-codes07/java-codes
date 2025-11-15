interface Arithematic{
    void add();
    void sub();
    void mul();
}
class interfaceDemo2 implements Arithematic{
    int a = 10 , b = 20 ;
    public void add(){
        System.out.println("Addition:"+(a+b));

    }public void sub(){
        System.out.println("Substraction:"+(a-b));
    }
    public void mul(){
        System.out.println("Multiplication:"+(a*b));
    }
}
public class inferenceDemo{
    public static void main(String[] args) {
        interfaceDemo2 obj = new interfaceDemo2();
        obj.add();
        obj.sub();
        obj.mul();
    }
}