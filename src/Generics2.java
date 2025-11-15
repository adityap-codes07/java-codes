public class Generics2 {
    public static void main(String[] args) {
        G obj = new G();
        obj.printArray(new Integer[] {1,2,3});
        obj.printArray(new String[]{"addy","ramesh"});
    }
}
class G{
    public <T> void printArray(T[] array){
        for(T elements :array){
            System.out.println(elements+" ");
        }
        System.out.println();
    }
}