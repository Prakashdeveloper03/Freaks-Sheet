import java.util.Scanner;

class Solution {
  long power(int N, int R) {
    int mod = 1000000007;
    if (R == 0) {
      return 1;
    }
    if (N == 0) {
      return 0;
    }
    if (R % 2 == 0) {
      long ans = power(N, R / 2);
      return (ans % mod * ans % mod) % mod;
    } else {
      long ans = power(N, (R - 1) / 2);
      return (ans % mod * ans % mod * N % mod) % mod;
    }
  }
}

class Power {
  public static long rev(long n) {
    long rev_num = 0;
    while (n > 0) {
      rev_num = rev_num * 10 + n % 10;
      n = n / 10;
    }
    return rev_num;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      Solution obj = new Solution();
      int N;
      N = sc.nextInt();
      int R = 0;
      R = (int) rev(N);
      long ans = (long) obj.power(N, R);
      System.out.println(ans);
      System.out.println("~");
    }
    sc.close();
  }
}
