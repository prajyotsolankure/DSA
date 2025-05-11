import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] a, int target) {
        int n = a.length;
        Arrays.sort(a);
        List<List<Integer>> list  = new ArrayList<>();
        for(int i=0;i<n-3;i++){
            if(i>0 && a[i] == a[i-1] ) continue;
            
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && a[j] == a[j-1]) continue;
                int left = j+1,right =n-1;
                while(left<right){
                    long sum = (long) a[i] + a[j] + a[left] + a[right];
                    if(sum == target){
                        list.add(Arrays.asList(a[i],a[j],a[left],a[right]));
                        while(left<right && a[left] == a[left+1]) left++;
                        while(left<right && a[right] == a[right-1]) right--;
                        
                        left++;
                        right--;

                        } else if(sum<target){
                            left++;
                        } else {
                            right--;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String args[])
    {
        Scanner l = new Scanner(System.in);
        int n = l.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = l.nextInt();
        }
        int target = l.nextInt();
        Solution sol = new Solution();
        sol.fourSum(a,target);

    }
}
