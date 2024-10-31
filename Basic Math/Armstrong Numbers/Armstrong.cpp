#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  bool armstrongNumber(int n) {
    int num = n, rem = 0, res = 0;
    while (n > 0) {
      rem = n % 10;
      res = res + (rem * rem * rem);
      n /= 10;
    }
    return (res == num);
  }
};

int main() {
  int t;
  cin >> t;
  while (t--) {
    int n;
    cin >> n;
    Solution ob;
    bool flag = ob.armstrongNumber(n);
    if (flag) {
      cout << "true" << endl;
    } else {
      cout << "false" << endl;
    }

    cout << "~"
         << "\n";
  }
  return 0;
}