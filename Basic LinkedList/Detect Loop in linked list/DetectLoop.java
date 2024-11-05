import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

class Solution {
  boolean detectLoop(Node head) {
    Node slow = head, fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) return true;
    }
    return false;
  }
}

class DetectLoop {
  public static void makeLoop(Node head, Node tail, int x) {
    if (x == 0) return;

    Node curr = head;
    for (int i = 1; i < x; i++) curr = curr.next;

    tail.next = curr;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());

    while (t-- > 0) {
      List<Integer> arr = new ArrayList<>();
      String input = br.readLine().trim();
      if (!input.isEmpty()) {
        String[] numbers = input.split("\\s+");
        for (String num : numbers) {
          if (!num.isEmpty()) {
            arr.add(Integer.parseInt(num));
          }
        }
      }

      int pos = Integer.parseInt(br.readLine().trim());

      Node head = null;
      if (!arr.isEmpty()) {
        head = new Node(arr.get(0));
        Node tail = head;
        for (int i = 1; i < arr.size(); ++i) {
          tail.next = new Node(arr.get(i));
          tail = tail.next;
        }
        makeLoop(head, tail, pos);
      }

      Solution x = new Solution();
      if (x.detectLoop(head)) System.out.println("true");
      else System.out.println("false");

      System.out.println("~");
    }
  }
}
