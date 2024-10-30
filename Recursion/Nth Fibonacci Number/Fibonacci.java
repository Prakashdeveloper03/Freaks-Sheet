import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Fibonacci {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      int n = Integer.parseInt(read.readLine());
      Solution ob = new Solution();

      System.out.println(ob.nthFibonacci(n));

      System.out.println("~");
    }
  }
}

class Solution {
  int nthFibonacci(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    int fib = 1;
    int fib1 = 1;
    int mod = 1000000007;
    for (int i = 3; i <= n; i++) {
      int r = (fib + fib1) % mod;
      fib = fib1;
      fib1 = r;
    }
    return fib1;
  }
}
