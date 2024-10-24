import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
  int isPrime(int N) {
    if (N <= 1) return 0;
    for (int i = 2; i <= N / i; i++) {
      if (N % i == 0) return 0;
    }
    return 1;
  }
}

class PrimeNumber {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      int N = Integer.parseInt(read.readLine());
      Solution ob = new Solution();
      System.out.println(ob.isPrime(N));
      System.out.println("~");
    }
  }
}
