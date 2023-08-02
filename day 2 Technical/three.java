// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner scr = new Scanner(System.in);
    int[] arr = {7,4,8,2,9};
    //7,4,8,2,9
    //
    int grt = arr[0];
    System.out.print(grt+" ");
    int count = 0;
    for(int i =0;i<arr.length;i++){
        if(grt<arr[i]){
        count++;
        System.out.print(arr[i]+" ");
        grt=arr[i];
        }
    }
    System.out.println("");
    System.out.println("\n"+count);
    }
}
