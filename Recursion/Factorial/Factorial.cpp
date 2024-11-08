#include <iostream>
using namespace std;
class Solution {
 public:
  long long int factorial(int n) { return (n == 1) ? 1 : n * factorial(n - 1); }
};

int main() {
  int t;
  cin >> t;
  while (t--) {
    int N;
    cin >> N;
    Solution ob;
    cout << ob.factorial(N) << endl;

    cout << "~" << "\n";
  }
  return 0;
}