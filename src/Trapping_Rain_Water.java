import java.util.*;
public class Trapping_Rain_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF BUILDINGS:");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("ENTER THE HEIGHT OF BUILDINGS:");
        for(int i = 0 ; i < n ; i++) {
            height[i] = sc.nextInt();
        }
        int result = trap(height);
        System.out.println("WATER TRAPPED BETWEEN THE BUILDINGS :"+result);
        sc.close();
    }
    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }
        return trappedWater;
    }
}

