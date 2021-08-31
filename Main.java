package SixTutorial;
// import java.util.*;

// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 44, 65, 78, 41};
        int target = 41;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
