import java.util.*;
public class Trapping_RainWater_NestedForLoop {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i = 0 ; i <n ; i++){
            height[i] = sc.nextInt();
        }
        int totalWater = 0;
        for(int i = 0 ; i < n ; i++){
            int leftMax = 0;
            for(int j =0 ; j<=i ; j++){
                leftMax = Math.max(leftMax,height[j]);
            }
            int rightMax = 0;
            for(int j = i ; j<n ; j++) {
                rightMax = Math.max(rightMax,height[j]);
            }
            totalWater += Math.min(leftMax,rightMax) - height[i];
        }
        System.out.println(totalWater);
    }
}
