public class Recursion1{
    public static void calculateSum(int i, int n, int sum){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        calculateSum(i+1, n ,sum);
        System.out.println(i);
        System.out.println(sum);
    }
    public static void main (String args[]){
       calculateSum(1,6,0);
    }
}