import java.util.*;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        Arrays.sort(nums);
        int[] result = {-1,-1};
        int s=-1,e=-1;
        for(int i=0;i<nums.length;i++ ){
        if(nums[i] == target){
            s=i;
            while(i+1<nums.length && nums[i] == nums[i+1]){
                i++;
            }
            e=i;
            result[0] = s;
            result[1] = e;
            break;
        }
        }
        
        return result;
    }
    public static void main(String args[]){
        Scanner l = new Scanner(System.in);
        int n = l.nextInt();
        int[] a = new int[n];
        int target = l.nextInt();
        for(int i = 0;i<n;i++){
            a[i] = l.nextInt();
        }
        Solution sol = new Solution();
        sol.searchRange(a,target);
    }
}
