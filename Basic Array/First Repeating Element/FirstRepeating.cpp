#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  int firstRepeated(vector<int> &arr) {
    unordered_map<int, int> map;
    int index = -1;
    for (int x : arr) map[x]++;
    for (int i = 0; i < arr.size(); i++) {
      if (map[arr[i]] > 1) {
        index = i + 1;
        break;
      }
    }
    return index;
  }
};

int main() {
  int t;
  cin >> t;
  cin.ignore();
  while (t--) {
    vector<int> arr;
    string input;
    getline(cin, input);
    stringstream ss(input);
    int number;
    while (ss >> number) {
      arr.push_back(number);
    }
    Solution ob;
    cout << ob.firstRepeated(arr) << endl;
    cout << "~" << endl;
  }
  return 0;
}