
public class Recursion1{
    public static void calculateSum(int i, int n, int sum ){
        if(i==n){
            sum += i;
            calculateSum(i+1,n,sum);
            
            return;
        }
       System.out.println(sum);

    }
    public static void main ( String args []){
        calculateSum(0,3,0);

    } 
}