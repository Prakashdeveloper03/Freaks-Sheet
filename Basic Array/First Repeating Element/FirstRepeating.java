import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
  int firstRepeated(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int index = -1;
    for (int x : arr) map.put(x, map.getOrDefault(x, 0) + 1);
    for (int i = 0; i < arr.length; i++) {
      if (map.get(arr[i]) > 1) {
        index = i + 1;
        break;
      }
    }
    return index;
  }
}

class FirstRepeating {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    while (t-- > 0) {
      String line = br.readLine();
      String[] tokens = line.split(" ");
      ArrayList<Long> array = new ArrayList<>();
      for (String token : tokens) {
        array.add(Long.parseLong(token));
      }
      int[] arr = new int[array.size()];
      int idx = 0;
      for (long i : array) arr[idx++] = (int) i;
      Solution obj = new Solution();
      System.out.println(obj.firstRepeated(arr));
      System.out.println("~");
    }
  }
}
