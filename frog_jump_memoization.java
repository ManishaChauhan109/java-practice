import java.util.Arrays;
public class frog_jump_memoization {
    public static int minEnergy(int n,int[] height,int[] dp) {
        int left,right=0;
        if (n == 0) {
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
         left=minEnergy(n-1,height,dp)+Math.abs(height[n]-height[n-1]);
         if(n>1){
         right=minEnergy(n-2, height,dp)+Math.abs(height[n]-height[n-2]);
         }
        dp[n]=Math.min(left,right);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4; // Example input: number of stairs
        int[] height = {30, 10, 60, 10, 60, 50}; // Example heights of stairs
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("Minimum energy required to reach the " + n + "th stair is: " + minEnergy(n,height,dp));
    }
}
