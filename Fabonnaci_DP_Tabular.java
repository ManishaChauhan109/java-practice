import java.util.Arrays;
public class Fabonnaci_DP_Tabular {
    public static int fun(int n,int[] dp){
        if(n==0 || n==1){
            return n;
        }
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
     public static void main(String[] args) {
        int n = 10; // Example input
         int[] dp = new int[n+1];
         Arrays.fill(dp,-1);
        System.out.println("Fabonacci of " + n + " is: " + fun(n,dp));
    } 
}
// time complexity: O(n) as we fill the dp array of size n
// space complexity: O(n) for the dp array
