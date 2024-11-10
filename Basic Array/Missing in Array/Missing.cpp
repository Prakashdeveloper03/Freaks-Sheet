#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  int missingNumber(vector<int>& arr) {
    int n = arr.size() + 1;
    int sum = n * (n + 1) / 2;
    int given_sum = 0;
    for (int i = 0; i <= arr.size() - 1; i++) {
      given_sum += arr[i];
    }
    int result = sum - given_sum;
    return result;
  }
};

int main() {
  int t;
  cin >> t;
  cin.ignore();
  while (t--) {
    int n;
    vector<int> a;
    string input;
    getline(cin, input);
    stringstream ss(input);
    int num;
    while (ss >> num) a.push_back(num);
    Solution obj;
    cout << obj.missingNumber(a) << endl;
    cout << "~\n";
  }
  return 0;
}