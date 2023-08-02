// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner scr = new Scanner(System.in);
      int n = scr.nextInt();
      int temp = n;
      int n2 = 0;
      while(temp!=0){
          int rem = temp%10;
          n2 = n2*10 +rem;
          temp/=10;
      }
      if(n2==n)System.out.println("palindrome number");
      else System.out.println("not Palindrome number");
    }
}
