import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
  String oddEven(int n) {
    return (n % 2 == 0) ? "even" : "odd";
  }
}

class OddOrEven {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      int N = Integer.parseInt(read.readLine());
      Solution ob = new Solution();
      System.out.println(ob.oddEven(N));
    }
  }
}
