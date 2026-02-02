public class Optimization_of_Tabular_Fib {
    public static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int prev2=0;
        int prev=1;
        for(int i=2;i<=n;i++)
        {
            int curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        return prev;
    }

     public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Fabonacci of " + n + " is: " + fib(n));
    } 
}
