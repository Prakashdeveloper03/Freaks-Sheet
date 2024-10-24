import java.util.Scanner;

class Solution {
  long floorSqrt(long n) {
    long low = 1, high = n, mid;
    while (low <= high) {
      mid = low + (high - low) / 2;
      if (mid * mid <= n) low = mid + 1;
      else high = mid - 1;
    }
    return high;
  }
}

class SquartRoot {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      long a = sc.nextInt();
      Solution obj = new Solution();
      System.out.println(obj.floorSqrt(a));
      t--;
      System.out.println("~");
    }
    sc.close();
  }
}
