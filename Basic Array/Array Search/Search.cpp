#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  int search(vector<int>& arr, int x) {
    for (int i = 0; i < arr.size(); i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }
};

int main() {
  int testcases;
  cin >> testcases;
  cin.ignore();
  while (testcases--) {
    vector<int> arr;
    int x;
    string input;
    getline(cin, input);
    stringstream ss(input);
    int number;
    while (ss >> number) {
      arr.push_back(number);
    }
    getline(cin, input);
    stringstream ss2(input);
    ss2 >> x;

    Solution ob;
    cout << ob.search(arr, x) << endl;
    cout << '~' << endl;
  }
  return 0;
}