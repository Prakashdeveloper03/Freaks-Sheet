import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Solution {
  void frequencyCount(int arr[], int N, int P) {
    HashMap<Integer, Integer> freqMap = new HashMap<>();
    for (int x : arr) {
      freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = freqMap.getOrDefault(i + 1, 0);
    }
  }
}

class Frequency {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    while (t-- > 0) {
      int N = Integer.parseInt(br.readLine().trim());
      int arr[] = new int[N];
      String inputLine[] = br.readLine().trim().split(" ");
      for (int i = 0; i < N; i++) {
        arr[i] = Integer.parseInt(inputLine[i]);
      }
      int P = Integer.parseInt(br.readLine().trim());
      Solution ob = new Solution();
      ob.frequencyCount(arr, N, P);
      for (int i = 0; i < N; i++) System.out.print(arr[i] + " ");
      System.out.println();
    }
  }
}
