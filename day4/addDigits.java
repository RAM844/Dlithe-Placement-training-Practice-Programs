import java.util.Scanner;
import java.util.ArrayList;
public class addDigits {
    public static void main(String[] args) {
        {
            Scanner scr = new Scanner(System.in);
            System.out.println("Enter num of digits in num 1");
            int n1 = scr.nextInt();
            System.out.println("Enter num1");
            int[] num1 = new int[n1];
            for(int i =0;i<n1;i++){
                num1[i]=scr.nextInt();
            }
            System.out.println("Enter num of digits in num 2");
            int n2 = scr.nextInt();
            System.out.println("Enter num2");
            int[] num2 = new int[n2];
            for(int i =0;i<n2;i++){
                num2[i]=scr.nextInt();
            }
            int carry = 0;
            int i = n1-1;
            int j = n2-1;
            ArrayList<Integer> ans = new ArrayList();
            while(i>=0 && j>=0){
                int sum = num1[i]+num2[j]+carry;
                int add = sum;
                if(sum>9){
                    add = sum%10;
                    carry = sum/10;
                }
                ans.add(add);
                i--;
                j--;
            }
            while(i>=0){
                int sum = num1[i]+carry;
                int add = sum;
                if(sum>9){
                    add = sum%10;
                    carry = sum/10;
                }
                ans.add(add);
                i--;
            }
            while(j>=0){
                int sum = num2[j]+carry;
                int add = sum;
                if(sum>9){
                    add = sum%10;
                    carry = sum/10;
                }
                ans.add(add);
                j--;
            }
            if(carry>0){
                ans.add(carry);
            }
            int n = ans.size();
            System.out.print("ans is ");
            for(i = n-1;i>=0;i--){
                System.out.print(ans.get(i)+"");
            }
        }
    }
}

