import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
  int evenlyDivides(int N) {
    int copy = N, counter = 0, rem = 0;
    while (N > 0) {
      rem = N % 10;
      if (rem != 0 && copy % rem == 0) counter++;
      N /= 10;
    }
    return counter;
  }
}

class CountDigits {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      int N = Integer.parseInt(read.readLine());
      Solution ob = new Solution();
      System.out.println(ob.evenlyDivides(N));
      System.out.println("~");
    }
  }
}
