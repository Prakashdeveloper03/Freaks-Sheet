import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Solution {
  public void sort012(int[] arr) {
    HashMap<Integer, Integer> freqMap = new HashMap<>();
    for (int x : arr) {
      freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
    }
    int index = 0;
    for (int i = 0; i < freqMap.getOrDefault(0, 0); i++) {
      arr[index++] = 0;
    }
    for (int i = 0; i < freqMap.getOrDefault(1, 0); i++) {
      arr[index++] = 1;
    }
    for (int i = 0; i < freqMap.getOrDefault(2, 0); i++) {
      arr[index++] = 2;
    }
  }
}

class CountingSort {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String input = br.readLine();
      String[] inputArray = input.split("\\s+");
      int a[] = new int[inputArray.length];
      for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);
      Solution ob = new Solution();
      ob.sort012(a);
      for (int num : a) {
        System.out.print(num + " ");
      }
      System.out.println();
      System.out.println("~");
    }
  }
}
