// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner scr = new Scanner(System.in);
      int n = scr.nextInt() ;
      int count =1,grt = scr.nextInt();
      for(int i =1;i<n;i++){
          int num = scr.nextInt();
         if(grt<num){
             grt=num;
             count++;
         }
    }
    System.out.println("count is "+count);
}
}
