#include <bits/stdc++.h>
using namespace std;
class Solution {
 public:
  void frequencyCount(vector<int>& arr, int N, int P) {
    unordered_map<int, int> freqMap;
    for (int x : arr) {
      freqMap[x]++;
    }
    for (int i = 0; i < arr.size(); i++) {
      arr[i] = freqMap[i + 1];
    }
  }
};

int main() {
  long long t;
  cin >> t;
  while (t--) {
    int N, P;
    cin >> N;
    vector<int> arr(N);
    for (int i = 0; i < N; i++) {
      cin >> arr[i];
    }
    cin >> P;
    Solution ob;
    ob.frequencyCount(arr, N, P);
    for (int i = 0; i < N; i++) cout << arr[i] << " ";
    cout << endl;
    cout << "~"
         << "\n";
  }
  return 0;
}