import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

class Solution {
  public static void swap(int arr[], int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  public static void reverse(int nums[], int i, int j) {
    while (i < j) {
      swap(nums, i, j);
      i++;
      j--;
    }
  }

  void rotateArr(int arr[], int d) {
    int n = arr.length;
    d = d % n;
    reverse(arr, 0, d - 1);
    reverse(arr, d, n - 1);
    reverse(arr, 0, n - 1);
  }
}

class RotateArray {
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    int t = Integer.parseInt(in.readLine().trim());
    while (t-- > 0) {
      String line = in.readLine();
      String[] tokens = line.split(" ");
      ArrayList<Integer> array = new ArrayList<>();
      for (String token : tokens) {
        array.add(Integer.parseInt(token));
      }
      int d = Integer.parseInt(in.readLine().trim());
      int n = array.size();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) arr[i] = array.get(i);
      new Solution().rotateArr(arr, d);
      StringBuilder sb = new StringBuilder();
      for (int value : arr) sb.append(value).append(" ");
      out.println(sb.toString().trim());
      out.println("~");
    }
    out.flush();
    out.close();
  }
}
