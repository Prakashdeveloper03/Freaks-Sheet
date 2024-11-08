#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  void swap(vector<int>& arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  void reverse(vector<int>& nums, int i, int j) {
    while (i < j) {
      swap(nums, i, j);
      i++;
      j--;
    }
  }

  void rotateArr(vector<int>& arr, int d) {
    int n = arr.size();
    d = d % n;
    reverse(arr, 0, d - 1);
    reverse(arr, d, n - 1);
    reverse(arr, 0, n - 1);
  }
};

int main() {
  int test_case;
  cin >> test_case;
  cin.ignore();
  while (test_case--) {
    int d;
    vector<int> arr, brr, crr;
    string input;
    getline(cin, input);
    stringstream ss(input);
    int number;
    while (ss >> number) {
      arr.push_back(number);
    }
    getline(cin, input);
    ss.clear();
    ss.str(input);
    while (ss >> number) {
      crr.push_back(number);
    }
    d = crr[0];
    int n = arr.size();
    Solution ob;
    ob.rotateArr(arr, d);
    for (int i = 0; i < n; i++) {
      cout << arr[i] << " ";
    }
    cout << endl;

    cout << "~"
         << "\n";
  }
  return 0;
}