import java.util.Arrays;

//Fabonacci series using DP(memoization method)
// class Fabonnaci_DP{
//     static int fabonacci(int n,int[] dp){
//         if(n==0 || n==1){
//             return n;
//         }
//         if(dp[n] != -1){
//             return dp[n];
//         }
//         dp[n] = fabonacci(n-1,dp) + fabonacci(n-2,dp);
//         return dp[n];
//     }

//     public static void main(String[] args) {
//         int n = 10; // Example input
//          int[] dp = new int[n+1];
//          Arrays.fill(dp,-1);
//         System.out.println("Fabonacci of " + n + " is: " + fabonacci(n,dp));
//     } 
// }

//Fabonacci series using DP(tabular method)
class Fabonnaci_Tabular{
    static int fabonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Fabonacci of " + n + " is: " + fabonacci(n));
    } 
}