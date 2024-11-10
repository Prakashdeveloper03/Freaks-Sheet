#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  int modulo(string& b, int n) {
    int res = 0;
    for (int i = 0; i < b.length(); i++) {
      res = (res * 10 + (b[i] - '0')) % 4;
    }
    return res;
  }
  int getLastDigit(string a, string b) {
    if (b == "0") {
      return 1;
    }
    if (a == "1") {
      return 1;
    }
    int mod = modulo(b, 4) == 0 ? 4 : modulo(b, 4);
    int ans = pow(a[a.length() - 1] - '0', mod);
    return ans % 10;
  }
};

int main() {
  int t;
  cin >> t;
  while (t--) {
    string a, b;

    cin >> a >> b;

    Solution ob;
    cout << ob.getLastDigit(a, b) << endl;

    cout << "~" << "\n";
  }
  return 0;
}