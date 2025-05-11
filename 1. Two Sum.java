import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                // Return indices of the two numbers
                return new int[] { map.get(complement), i };
            }

            // Store the number and its index
            map.put(nums[i], i);
        }

        // Return {-1, -1} if no solution is found
        return new int[] { -1, -1 };
    }

    public static void main(String args[]) {
        Scanner g = new Scanner(System.in);

        int n = g.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = g.nextInt();
        }

        int target = g.nextInt();

        Solution sol = new Solution();
        int[] result = sol.twoSum(a, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
