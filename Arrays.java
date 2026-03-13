import java.util.*;
public class Arrays {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int numbers [] = new int [size];


        for (int i =0; i <size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        // int[] marks = new int[4];
        // marks [0] = 39;
        // marks [1] = 32249;
        // marks [2] = 29;
        // marks [3] = 59;
        // System.out.println(marks[1]);
        // System.out.println(marks[0]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        for (int i =0;i <numbers.length;i++){
            if(numbers[i] == x){
                System.out.println("x found at index :" + i);
            }
        }
        sc.close();
    }
}
     








