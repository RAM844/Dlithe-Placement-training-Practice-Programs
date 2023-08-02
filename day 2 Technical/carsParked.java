import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner scr = new Scanner(System.in);
      int m = scr.nextInt() ;
      int n = scr.nextInt() ;
      System.out.println(" Enter the elements");
      int max = 0,maxi=0;
      for(int i =0;i<m;i++){
          int countc = 0;
          System.out.println(" Row "+i+1);
         for(int j =0;j<n;j++){
             int num = scr.nextInt();
            if(num==1)countc++;
         }
        
         if(countc>max){
             max=countc;
             maxi=i+1;
         }
    }
    System.out.println("the row number "+maxi+" has most cars parked: "+max);
}}
