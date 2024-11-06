import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

class Solution {
  int findFirstNode(Node head) {
    Node slow = head, fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        slow = head;
        while (slow != fast) {
          slow = slow.next;
          fast = fast.next;
        }
        return slow.data;
      }
    }
    return -1;
  }
}

class FindFirstNodeInLoop {
  public static void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println();
  }

  public static void makeLoop(Node head, Node tail, int x) {
    if (x == 0) return;
    Node curr = head;
    for (int i = 1; i < x; i++) curr = curr.next;
    tail.next = curr;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      ArrayList<Integer> arr = new ArrayList<>();
      String input = br.readLine();
      StringTokenizer st = new StringTokenizer(input);
      while (st.hasMoreTokens()) {
        arr.add(Integer.parseInt(st.nextToken()));
      }
      int k = Integer.parseInt(br.readLine());
      Node head = new Node(arr.get(0));
      Node tail = head;
      for (int i = 1; i < arr.size(); ++i) {
        tail.next = new Node(arr.get(i));
        tail = tail.next;
      }
      makeLoop(head, tail, k);
      Solution ob = new Solution();
      System.out.println(ob.findFirstNode(head));
    }
  }
}
