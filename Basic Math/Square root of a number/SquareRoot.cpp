#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  long long int floorSqrt(long long int n) {
    long long int low = 1, high = n, mid;
    while (low <= high) {
      mid = low + (high - low) / 2;
      if (mid * mid <= n)
        low = mid + 1;
      else
        high = mid - 1;
    }
    return high;
  }
};

int main() {
  int t;
  cin >> t;
  while (t--) {
    long long n;
    cin >> n;
    Solution obj;
    cout << obj.floorSqrt(n) << endl;

    cout << "~"
         << "\n";
  }
  return 0;
}