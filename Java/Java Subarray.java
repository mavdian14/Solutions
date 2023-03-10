import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int sumSubArray(int[] arr, int a, int z)
    {
        int result = 0;
        for(int i=a;i<z;i++){
            result += arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        int result = 0;
        for(int i =1;i<=n;i++){
            for(int x=0;x+i <=n;x++){
                if(sumSubArray(arr,x,x+i)<0)
                {
                    result +=1;
                }
            }
        }
        System.out.println(result);
    }
}
