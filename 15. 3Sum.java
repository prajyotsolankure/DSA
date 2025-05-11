import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> list = new ArrayList<>();
        int n = a.length;
        Arrays.sort(a);

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue; 

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = a[i] + a[left] + a[right];
                if (sum == 0) {
                    list.add(Arrays.asList(a[i], a[left], a[right]));
                    while (left < right && a[left] == a[left + 1]) left++;
                    while (left < right && a[right] == a[right - 1]) right--;
                  
                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int n = l.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = l.nextInt();
        }
        Solution sol = new Solution();
        List<List<Integer>> result = sol.threeSum(a);
        System.out.println(result);
    }
}
