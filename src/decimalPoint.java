import java.util.*;
public class decimalPoint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1:");
        int x1 = sc.nextInt();
        System.out.println("Enter y1:");
        int y1 = sc.nextInt();
        System.out.println("Enter x2:");
        int x2 = sc.nextInt();
        System.out.println("Enter y2:");
        int y2 = sc.nextInt();
        double midX = (x1+x2)/2.0;
        double midY = (y1+y2)/2.0;
        System.out.printf("The mid points are (%.2f,%.2f)",midX,midY);
    }
}