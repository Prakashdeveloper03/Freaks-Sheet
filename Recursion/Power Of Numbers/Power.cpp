#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  long long power(int N, int R) {
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
};

long long rev(long long n) {
  long long rev_num = 0;
  while (n > 0) {
    rev_num = rev_num * 10 + n % 10;
    n = n / 10;
  }
  return rev_num;
}

int main() {
  int T;
  cin >> T;
  while (T--) {
    long long N;
    cin >> N;
    long long R = 0;
    R = rev(N);
    Solution ob;
    long long ans = ob.power(N, R);
    cout << ans << endl;

    cout << "~" << "\n";
  }
}