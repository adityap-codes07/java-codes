import java.util.*;

class Overload {
    int x, y;

    Overload() {
        System.out.println("Default constructor called");
        x = 0;
        y = 0;
    }

    Overload(int a, int b) {
        System.out.println("Parameterized constructor called");
        x = a;
        y = b;
    }

    void add() {
        Scanner sc = new Scanner(System.in);
        int a, b, sum;
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a + b;
        System.out.println("SUM = " + sum);
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b) {
        return a + b;
    }

    void showXY() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class Main {
    public static void main(String[] args) {
        Overload obj1 = new Overload();
        obj1.showXY();

        Overload obj2 = new Overload(5, 10);
        obj2.showXY();

        obj1.add();
        int intSum = obj2.add(2, 5);
        System.out.println("Integer SUM = " + intSum);

        double doubleSum = obj2.add(3.5, 7.3);
        System.out.println("Double SUM = " + doubleSum);
    }
}
