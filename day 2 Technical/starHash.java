// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner scr = new Scanner(System.in);
      String  s= scr.next();
      int count1 =0,count2 =0;
      for(int i =0;i<s.length();i++){
          if(s.charAt(i)=='*'){
              count1++;
          }else{
              count2++;
          }
      }
      if(count1>count2)System.out.println("positive");
      else if(count2>count1)System.out.println("Negative");
      else System.out.println("Equall");
    }
}
