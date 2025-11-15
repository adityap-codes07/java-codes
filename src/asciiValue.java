import java.util.*;
class asciiValue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character:");
        char ch = sc.next().charAt(0);
        int asciiValue = (int)ch;
        System.out.println("Ascii Value of "+ch+" is "+asciiValue);
    }
}