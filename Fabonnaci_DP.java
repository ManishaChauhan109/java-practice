// Fabonacci series using DP(memization method)
import java.util.Arrays;
class Fabonnaci_DP{
    static int fabonacci(int n,int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = fabonacci(n-1,dp) + fabonacci(n-2,dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10; // Example input
         int[] dp = new int[n+1];
         Arrays.fill(dp,-1);
        System.out.println("Fabonacci of " + n + " is: " + fabonacci(n,dp));
    } 
}

