#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  int evenlyDivides(int N) {
    int copy = N, counter = 0, rem = 0;
    while (N > 0) {
      rem = N % 10;
      if (rem != 0 && copy % rem == 0) counter++;
      N /= 10;
    }
    return counter;
  }
};

int main() {
  int t;
  cin >> t;
  while (t--) {
    int N;
    cin >> N;
    Solution ob;
    cout << ob.evenlyDivides(N) << endl;

    cout << "~" << "\n";
  }
  return 0;
}