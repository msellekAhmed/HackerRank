import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(n, k, a);
        for ( int i =0 ; i < n ; i++)
        {
            System.out.print(result[i]+ " ");
        }
        
    }
    
    public static int[] leftRotation(int n, int d, int[] arr )
    {
        int[] res = new int[n];
        for( int i = d; i < n ; i++ )
        {
            res[i-d] = arr[i];
        }
        for( int j = 0; j < d ; j++ )
        {
            res[n-d+j] = arr[j];
        }
        return res;
    }
    
}
