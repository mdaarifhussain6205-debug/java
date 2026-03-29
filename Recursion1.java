public class Recursion1 {
    public static void calculateSum(int i, int n, int sum){
        if(i==n){
            sum +=i;
            System.out.print(sum);
            return;
        }
    sum += i;
    calculateSum(i+1, n, sum);
       
    }
    public static void main ( String args []){
        calculateSum(1, 05, 0);
      
    }
}
