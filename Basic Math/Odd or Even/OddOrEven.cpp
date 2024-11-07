#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  string oddEven(int n) { return (n % 2 == 0) ? "even" : "odd"; }
};

int main() {
  int t;
  cin >> t;
  while (t--) {
    int N;
    cin >> N;
    Solution ob;
    cout << ob.oddEven(N) << endl;
    cout << "~\n";
  }
  return 0;
}