import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
  public String is_palindrome(int n) {
    int num = n, rem = 0, res = 0;
    while (n > 0) {
      rem = n % 10;
      res = res * 10 + rem;
      n /= 10;
    }
    return (res == num) ? "Yes" : "No";
  }
}

class Palindrome {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine().trim());
    while (T-- > 0) {
      int n = Integer.parseInt(br.readLine().trim());
      Solution ob = new Solution();
      String ans = ob.is_palindrome(n);
      System.out.println(ans);
      System.out.println("~");
    }
  }
}
