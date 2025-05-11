/*
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
 

Example 1:

Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.
Example 2:

Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds. 
*/


import java.util.Scanner;
class Solution {
    public boolean threeConsecutiveOdds(int[] a) {
        int n = a.length;
        int i =0;
        while(i < n){
            if(i+2<n && a[i]%2 !=0 && a[i+1]%2 != 0 && a[i+2]%2 !=0){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner l = new Scanner(System.in);
        int n = l.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = l.nextInt();
        }
        Solution sol = new Solution();
        sol.threeConsecutiveOdds(a);
    }
}
