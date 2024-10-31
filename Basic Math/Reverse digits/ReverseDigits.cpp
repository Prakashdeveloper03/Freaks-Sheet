#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  long long int reverse_digit(long long int n) {
    long long int res = 0, rem = 0;
    while (n > 0) {
      rem = n % 10;
      res = res * 10 + rem;
      n /= 10;
    }
    return res;
  }
};

int main() {
  int T;
  cin >> T;
  while (T--) {
    long long int n;
    cin >> n;
    Solution ob;
    long long int ans = ob.reverse_digit(n);
    cout << ans << "\n";

    cout << "~" << "\n";
  }
  return 0;
}