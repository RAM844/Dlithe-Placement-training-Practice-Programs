// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner scr = new Scanner(System.in);
      int n = scr.nextInt();
      int[] arr = new int[n];
    for(int i =0;i<n;i++){
       arr[i]=scr.nextInt();
       for(int j = i;j>0;j--){
           if(arr[j-1]>arr[j]){
               int temp = arr[j];
               arr[j]=arr[j-1];
               arr[j-1]= temp;
           }else{
	break;
	}
       }
    }
    for(int i =0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
  
