import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=scr.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        SelectionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void SelectionSort(int[] arr,int n){
        for(int i =0;i<n;i++){
            int minj = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[minj]){
                    minj=j;
                }
            }
            int temp = arr[minj];
            arr[minj]=arr[i];
            arr[i]=temp;
        }
    }
}

