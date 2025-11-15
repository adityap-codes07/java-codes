import java.util.*;
class overload{
    void add(){
        Scanner sc = new Scanner(System.in);
        int a,b,sum;
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println("SUM = "+sum);
    }
    double add(double a,double b){
        return a+b;
    }
}
public class Main{
    public static void main(String[] args) {
        overload obj = new overload();
        obj.add();
        //int b = obj.add(2,5);
        double c = obj.add(3.5,7.3);
        System.out.println("SUM IS "+c);


    }
}