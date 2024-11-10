#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  string is_palindrome(int n) {
    int num = n, rem = 0, res = 0;
    while (n > 0) {
      rem = n % 10;
      res = res * 10 + rem;
      n /= 10;
    }
    return (res == num) ? "Yes" : "No";
  }
};

int main() {
  int T;
  cin >> T;
  while (T--) {
    int n;
    cin >> n;
    Solution ob;
    string ans = ob.is_palindrome(n);
    cout << ans << "\n";

    cout << "~" << "\n";
  }
  return 0;
}