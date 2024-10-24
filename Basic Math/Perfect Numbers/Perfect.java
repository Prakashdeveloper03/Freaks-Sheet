import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
  int isPerfectNumber(long N) {
    long res = 0;
    for (int i = 1; i < Math.sqrt(N); i++) {
      if (N % i == 0) {
        res += i;
        if (N / i != N) res = res + N / i;
      }
    }
    return (res == N) ? 1 : 0;
  }
}
;

class Perfect {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      long N = Long.parseLong(read.readLine());
      Solution ob = new Solution();
      System.out.println(ob.isPerfectNumber(N));
      System.out.println("~");
    }
  }
}
