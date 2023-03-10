import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //list<List<Integer>> intializes a 2D integer array
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            //replaceAll() returns a str removing all the chars in str matching the regex pattern
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            // Appends the specified element to the end of this list (optional operation)
            arr.add(arrRowItems);
        }
        int sum = 0;
        int maxSum = -1000;
        // for (List list : arr) {
        //      System.out.println(list);
        // }
        for(int i=0;i<arr.size()-2;i++){
            for(int j=0;j<arr.size()-2;j++){
                sum=0;
                //returns the element in specified position. (arr.get(i).get(j) returns the elements at a[i][j] in a 2D array)
                sum += arr.get(i).get(j)+arr.get(i).get(j+1) + arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);

        bufferedReader.close();
    }
}
