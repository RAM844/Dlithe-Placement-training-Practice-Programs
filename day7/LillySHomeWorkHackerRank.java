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
     * Complete the 'lilysHomework' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int lilysHomework(List<Integer> arr) {
    // Write your code here
    List<Integer> ans = new ArrayList();
    ans.addAll(arr);
    Collections.sort(arr);
    int count1 = 0;
    int n = arr.size();
    for(int i =0;i<n;i++){
        if(ans.get(i)!=arr.get(i)){
            count1++;
        }
    }
    Collections.sort(arr,(a,b)->Integer.compare(b,a));
    int count2 = 0;
    for(int i =0;i<n;i++){
        if(ans.get(i)!=arr.get(i)){
            count2++;
        }
    }
    return (count1<count2)?count1-1:count2-1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.lilysHomework(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

