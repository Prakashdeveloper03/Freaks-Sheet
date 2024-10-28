import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.StringTokenizer;

class Compute {
  public String isSubset(long a1[], long a2[], long n, long m) {
    Hashtable<Long, Integer> freq = new Hashtable<>();
    for (long x : a1) freq.put(x, freq.getOrDefault(x, 0) + 1);
    for (long x : a2) {
      if (!freq.containsKey(x) || freq.get(x) == 0) return "No";
      else freq.put(x, freq.get(x) - 1);
    }
    return "Yes";
  }
}

class Subset {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    while (t-- > 0) {
      StringTokenizer stt = new StringTokenizer(br.readLine());
      long n = Long.parseLong(stt.nextToken());
      long m = Long.parseLong(stt.nextToken());
      long a1[] = new long[(int) (n)];
      long a2[] = new long[(int) (m)];
      String inputLine[] = br.readLine().trim().split(" ");
      for (int i = 0; i < n; i++) {
        a1[i] = Long.parseLong(inputLine[i]);
      }
      String inputLine1[] = br.readLine().trim().split(" ");
      for (int i = 0; i < m; i++) {
        a2[i] = Long.parseLong(inputLine1[i]);
      }
      Compute obj = new Compute();
      System.out.println(obj.isSubset(a1, a2, n, m));
      System.out.println("~");
    }
  }
}
