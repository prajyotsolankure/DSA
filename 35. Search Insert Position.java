import java.util.Scanner;
public class SearchInsert {
    public static void main(String args[]){
        int[] a = {1,3,5,6};
        int b=0,e=a.length-1;
        int target = 9;
        int mid,found = 0 ;
        for(int i=0;i< a.length;i++){
            mid = (b+e)/2;

            if(a[mid] == target){
                System.out.println(mid+"");
                found = 1;
                break;
            } else if (a[mid] < target) {
                b++;
            } else {
                e--;
            }
        }
        if(found == 0){
            System.out.println(b+"");
        }
    }
}
