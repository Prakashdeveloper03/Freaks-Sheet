#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  int minIncrements(vector<int> arr) {
    int ans = 0;
    map<int, int> freqMap;
    for (int x : arr) freqMap[x]++;
    for (pair<const int, int> item : freqMap) {
      int num = item.first;
      int freq = item.second;
      if (freq == 1) {
        continue;
      }
      int cnt = freq - 1;
      int val = num + 1;
      while (cnt--) {
        while (freqMap[val] > 0) val++;
        freqMap[val]++;
        ans += (val++) - num;
      }
    }
    return ans;
  }
};

int main() {
  int t;
  cin >> t;
  cin.ignore();
  while (t--) {
    vector<int> a;
    string input;
    getline(cin, input);
    stringstream ss(input);
    int number;
    while (ss >> number) {
      a.push_back(number);
    }

    Solution ob;
    int ans = ob.minIncrements(a);
    cout << ans << endl;
  }
  return 0;
}