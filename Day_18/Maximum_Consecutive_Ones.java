package Day_18;
import java.util.*;

public class Maximum_Consecutive_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for ( int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        int ans = consecutive_one(arr);
        System.out.print(ans);
    }

    public static int consecutive_one ( int[] arr){
        int n = arr.length ;
        int count = 0 ;
        int maxOne = 0 ;

        for( int i = 0 ; i < n ; i++ ){
            if ( arr[i] == 1){                          // 1 0 1 1
                count++;
            } else {
                maxOne = Math.max ( maxOne , count);
                count = 0;
            }
        }

        maxOne = Math.max ( maxOne , count);
        return maxOne ;
    }
}
