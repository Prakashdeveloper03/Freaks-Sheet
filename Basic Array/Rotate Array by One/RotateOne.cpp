#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  void rotate(vector<int> &arr) {
    int lastElement = arr[arr.size() - 1];
    for (int i = arr.size() - 1; i > 0; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = lastElement;
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
    ob.rotate(arr);
    for (long long i = 0; i < arr.size(); i++) {
      cout << arr[i] << " ";
    }
    cout << endl;
    cout << "~" << endl;
  }
  return 0;
}