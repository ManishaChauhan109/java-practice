public class Fabonnaci_recursion {
    public static int fabonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fabonacci(n - 1) + fabonacci(n - 2);
    }
    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println("Fabonacci of " + n + " is: " + fabonacci(n));
    }
}
// time complexity: O(2^n) as the function call grows exponentially
// space complexity: O(n) for the recursion stack
