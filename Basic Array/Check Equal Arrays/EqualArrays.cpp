#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  bool check(vector<int>& arr1, vector<int>& arr2) {
    unordered_map<int, int> map;
    for (int num : arr1) {
      map[num]++;
    }
    for (int num : arr2) {
      map[num]--;
    }
    for (auto count : map) {
      if (count.second != 0) {
        return false;
      }
    }
    return true;
  }
};

int main() {
  int t;
  cin >> t;
  cin.ignore();
  while (t--) {
    vector<int> arr1, arr2;
    string input1, input2;
    getline(cin, input1);
    stringstream ss1(input1);
    int number;
    while (ss1 >> number) {
      arr1.push_back(number);
    }
    getline(cin, input2);
    stringstream ss2(input2);
    while (ss2 >> number) {
      arr2.push_back(number);
    }
    Solution ob;
    cout << (ob.check(arr1, arr2) ? "true" : "false") << "\n~\n";
  }
  return 0;
}