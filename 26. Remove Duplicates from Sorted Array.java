import java.util.Scanner;
class Solution {
    public int removeDuplicates(int[] nums) {
        int j =0;
        for(int i =1;i<nums.length;i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
    public static void main(String args[]){
        Scanner l = new Scanner(System.in);
        int n = l.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = l.nextInt();
        }
        Solution sol = new Solution();
        sol.removeDuplicates(a);
    }
}
