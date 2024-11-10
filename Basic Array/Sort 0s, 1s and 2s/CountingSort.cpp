#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  void sort012(vector<int>& arr) {
    unordered_map<int, int> freqMap;
    for (int x : arr) {
      freqMap[x]++;
    }
    int index = 0;
    for (int i = 0; i < freqMap[0]; i++) {
      arr[index++] = 0;
    }
    for (int i = 0; i < freqMap[1]; i++) {
      arr[index++] = 1;
    }
    for (int i = 0; i < freqMap[2]; i++) {
      arr[index++] = 2;
    }
  }
};

int main() {
  int t;
  cin >> t;
  cin.ignore();
  while (t--) {
    vector<int> a;
    string input;
    int num;
    getline(cin, input);
    stringstream s2(input);
    while (s2 >> num) {
      a.push_back(num);
    }
    Solution ob;
    ob.sort012(a);
    int n = a.size();
    for (int i = 0; i < n; i++) {
      cout << a[i] << " ";
    }
    cout << endl;
  }
  return 0;
}