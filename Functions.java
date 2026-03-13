import java.util.*;
public class Functions {
    // public static int calculateSum(int a, int b){
        // int sum = a * b;
        // return sum;
    //     public static int calculateMul (int a , int b){
            
    //         return a*b;
        
    // }
    
    public static void calculateFact ( int n){
        if (n<0){
            System.out.println("Invalid Number");
            return;
        }
         int Fact = 1;
         for (int i=1; i<= n; i++){
         Fact = Fact * i;
         
         }
         System.out.println(Fact);

    }
    
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        


         calculateFact(n);

    sc.close();

    }

}