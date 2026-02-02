class Solution {
    //This problem is same as fibonacci number, so you can use dp(tabular or memoization) and recursion according to your time and space complexity requirement
    public static int climbStairs(int n) {
        if(n<=1)
        {
            return 1;
        }
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        // return climbStairs(n-1)+climbStairs(n-2);//from recursion time complexity 2^n
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }   
    public static void main(String[] args) {
        int n=5;
        System.out.println("Total way to reach "+n+"th stairs is: "+climbStairs(n));
    }   
}