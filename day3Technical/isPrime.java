// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner scr = new Scanner(System.in);
      int n = scr.nextInt();
      if(isPrime(n)){
          System.out.println("Prime number");
      }else{
          System.out.println("not Prime");
      }
    }
    public static boolean isPrime(int n){
	if(n==1)return false; 
     for(int i =2;i<(n-1);i++){
          if(n%i==0){
              return false;
          }
      }
    return true;
    }
    }


 
