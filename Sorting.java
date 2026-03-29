import java.util.*;
public class Sorting {


    public static void main (String args[]){
        int arr[] = {3,5,2,1,8,9};
        for (int i=0; i<arr.length-1; i++){
            for (int j=0;j<arr.length-1-i;i++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.print(arr);
                }

            }
        }
    }
    
}
