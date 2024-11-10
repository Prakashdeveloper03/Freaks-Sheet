#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  pair<long long, long long> getMinMax(vector<long long int> arr) {
    int minElement = arr[0], maxElement = arr[0];
    for (int i = 1; i < arr.size(); i++) {
      minElement = (arr[i] < minElement) ? arr[i] : minElement;
      maxElement = (arr[i] > maxElement) ? arr[i] : maxElement;
    }
    return {minElement, maxElement};
  }
};

int main() {
  int t;
  cin >> t;
  cin.ignore();
  while (t--) {
    vector<long long int> arr;
    string input;
    getline(cin, input);
    stringstream ss(input);
    int number;
    while (ss >> number) {
      arr.push_back(number);
    }
    Solution ob;
    pair<long long, long long> pp = ob.getMinMax(arr);
    cout << pp.first << " " << pp.second << endl;
  }
  return 0;
}