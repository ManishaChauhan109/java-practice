public class frog_jump_recursion {
    public static int minEnergy(int n,int[] height) {
        int left,right=0;
        if (n == 0) {
            return 0;
        }
           left=minEnergy(n-1,height)+Math.abs(height[n]-height[n-1]);
         if(n>1){
          right=minEnergy(n-2, height)+Math.abs(height[n]-height[n-2]);
         }
         else{
            right=Integer.MAX_VALUE;
         }
        return Math.min(left,right);
    }
    public static void main(String[] args) {
        int n = 4; // Example input: number of stairs
        int[] height = {30, 10, 60, 10, 60, 50}; // Example heights of stairs
        System.out.println("Minimum energy required to reach the " + n + "th stair is: " + minEnergy(n,height));
    }
}
