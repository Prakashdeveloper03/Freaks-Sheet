import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
  long factorial(int n) {
    return (n == 1) ? 1 : n * factorial(n - 1);
  }
}

class Factorial {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      int N = Integer.parseInt(read.readLine());
      Solution ob = new Solution();
      System.out.println(ob.factorial(N));

      System.out.println("~");
    }
  }
}
