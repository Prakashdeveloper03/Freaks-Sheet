#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  int gcd(int a, int b) {
    if (a == b) return a;
    if (a == 0) return b;
    if (b == 0)
      return a;
    else
      return gcd(b, a % b);
  }
};

int main() {
  int t;
  scanf("%d ", &t);
  while (t--) {
    int a;
    scanf("%d", &a);
    int b;
    scanf("%d", &b);
    Solution obj;
    int res = obj.gcd(a, b);
    cout << res << endl;
    cout << "~" << "\n";
  }
}