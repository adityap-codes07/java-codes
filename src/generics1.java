import java.util.*;
public class generics1{
    public static void main(String[] args) {
        ArrayList<String> list = new <String>ArrayList();
        list.add("Hello");
        list.add("123");
        list.add("3.14");
        String o =  list.get(0);
        String o1 = list.get(1);
        System.out.println(o);
        System.out.println(o1);
        Float x1 = 9.12F;
        System.out.println(x1);
    }
}