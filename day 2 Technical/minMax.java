// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner scr = new Scanner(System.in);
      int n = scr.nextInt() ;
      System.out.println(" ");
      int count =1,min = scr.nextInt(),max = min;
      for(int i =1;i<n;i++){
          int num = scr.nextInt();
        min = min>num?num:min;
        max = max<num?num:max;
    }
    System.out.println("min and max is "+min+" and "+max);
}
}
