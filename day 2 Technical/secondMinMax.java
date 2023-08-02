// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner scr = new Scanner(System.in);
      int n = scr.nextInt() ;
      System.out.println(" ");
      int count =1,min = scr.nextInt(),max = min;
      int prevMin=min,prevMax=max;
      for(int i =1;i<n;i++){
          int num = scr.nextInt();
        
        if(min>num){
            prevMin=min;
            min=num;
        }
        if(max<num){
            prevMax=max;
            max=num;
        }
    }
    System.out.println("min and max is "+prevMax+" and "+PrevMin);
}
}

