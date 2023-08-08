import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
        int temp = arr.get(n-1);
        int[] ar = new int[n];
        for(int i =0;i<n;i++){
            ar[i]=arr.get(i);
        }
        boolean flag = true;
        for(int i=n-2;i>=0;i--){
            // System.out.print("i is "+i+" ");
            if(ar[i]>temp){
                ar[i+1]=ar[i];
            }else{
                ar[i+1]=temp;
                flag = false;
                break;
            }
            for(int j =0;j<n;j++){
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
        if(flag){
            ar[0]=temp;
        }
         for(int j =0;j<n;j++){
                System.out.print(ar[j]+" ");
            }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}

