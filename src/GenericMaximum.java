public class GenericMaximum {
    public static void main(String[] args) {
        System.out.printf("Max of %d %d %d is %d\n",3,4,5,MaximumTest.max(3,4,5));
        System.out.printf("Max of %f %f %f is %f\n",6.6,7.7,8.8,MaximumTest.max(6.6,7.7,8.8));
        System.out.printf("Max of %s %s %s is %s\n","pear","apple","orange",MaximumTest.max("pear","apple","orange"));
    }
}
class MaximumTest{
    public static <T extends Comparable<T>> T max(T x,T y,T z){
        T max =x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }
}
