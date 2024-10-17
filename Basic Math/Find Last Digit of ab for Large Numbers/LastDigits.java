import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Solution {
  int getLastDigit(String a, String b) {
    BigInteger base = new BigInteger(a);
    BigInteger exponent = new BigInteger(b);
    BigInteger modulus = BigInteger.TEN;
    BigInteger result = base.modPow(exponent, modulus);
    int lastDigit = result.intValue();
    return lastDigit;
  }
}

class LastDigits {
  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      String S[] = read.readLine().split(" ");
      String a = S[0];
      String b = S[1];
      Solution ob = new Solution();
      System.out.println(ob.getLastDigit(a, b));
    }
  }
}
