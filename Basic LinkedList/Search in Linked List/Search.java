import java.io.IOException;
import java.util.Scanner;

class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

class Solution {
  boolean searchKey(int n, Node head, int key) {
    while (head != null) {
      if (head.data == key) return true;
      head = head.next;
    }
    return false;
  }
}

class Search {
  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      Node head = new Node(sc.nextInt());
      Node tail = head;
      for (int i = 0; i < n - 1; i++) {
        tail.next = new Node(sc.nextInt());
        tail = tail.next;
      }
      int key = sc.nextInt();
      Solution g = new Solution();
      boolean ans = g.searchKey(n, head, key);
      System.out.println(ans ? "1" : "0");
      // printList(head);
      t--;

      System.out.println("~");
    }
    sc.close();
  }
}
