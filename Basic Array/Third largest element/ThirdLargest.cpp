#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  int thirdLargest(vector<int> &arr) {
    int n = arr.size();
    if (n < 3) return -1;
    priority_queue<int> maxHeap(arr.begin(), arr.end());
    maxHeap.pop();
    maxHeap.pop();
    return maxHeap.top();
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
    cout << ob.thirdLargest(arr) << endl;
    cout << "~" << endl;
  }
  return 0;
}