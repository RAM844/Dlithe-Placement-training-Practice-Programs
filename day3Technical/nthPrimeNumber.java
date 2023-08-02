// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner scr = new Scanner(System.in);
      int n = scr.nextInt();
    //   System.out.println(isPrime(4));
      System.out.println(nThPrime(n));
    }
    public static int nThPrime(int n){
        int i =2;
        int count = 0;
        while(true){
            if(isPrime(i))count++;
            if(count==n)return i;
            i++;
        }
    }
    public static boolean isPrime(int n){
        if(n==1)return false;
      for(int i =2;i<=(n)/2;i++){
          if(n%i==0){
              return false;
          }
      }
    return true;
    }
    }


 
