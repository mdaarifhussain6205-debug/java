public class Recursion1{
    public static void calculateMul(int i, int n, int mul){
        if(i==n ){
            mul *= i;
            System.out.println(mul);
            return;
        }
        mul *=i;
        calculateMul(i+1, n ,mul);
        
    }
    public static void main (String args[]){
       calculateMul(1,6,1);
    }
}