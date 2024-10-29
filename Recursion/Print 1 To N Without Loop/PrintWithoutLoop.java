import java.util.Scanner;

class Solution {
  public void printNos(int n) {
    if (n == 0) return;
    printNos(n - 1);
    System.out.print(n + " ");
  }
}

class PrintWithoutLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      Solution obj = new Solution();
      int N;
      N = sc.nextInt();
      obj.printNos(N);
      System.out.println();
      System.out.println("~");
    }
    sc.close();
  }
}
