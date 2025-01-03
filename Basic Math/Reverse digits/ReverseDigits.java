import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
  public long reverse_digit(long n) {
    long res = 0, rem = 0;
    while (n > 0) {
      rem = n % 10;
      res = res * 10 + rem;
      n /= 10;
    }
    return res;
  }
}

class ReverseDigits {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine().trim());
    while (T-- > 0) {
      long n = Long.parseLong(br.readLine().trim());
      Solution ob = new Solution();
      long ans = ob.reverse_digit(n);
      System.out.println(ans);

      System.out.println("~");
    }
  }
}
