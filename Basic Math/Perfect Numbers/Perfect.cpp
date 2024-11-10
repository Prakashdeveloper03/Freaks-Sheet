#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  int isPerfectNumber(long long N) {
    long res = 0;
    for (int i = 1; i < sqrt(N); i++) {
      if (N % i == 0) {
        res += i;
        if (N / i != N) res = res + N / i;
      }
    }
    return (res == N) ? 1 : 0;
  }
};

int main() {
  int t;
  cin >> t;
  while (t--) {
    long long N;

    cin >> N;

    Solution ob;
    cout << ob.isPerfectNumber(N) << endl;

    cout << "~" << "\n";
  }
  return 0;
}