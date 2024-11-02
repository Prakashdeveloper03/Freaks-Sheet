import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

class Solution {
  Node reverseList(Node head) {
    if (head == null) return null;
    if (head.next == null) return head;
    Node lastNode = head;
    Node currentNode = head.next;
    lastNode.next = null;
    while (currentNode != null) {
      Node futureCurrentNode = currentNode.next;
      currentNode.next = lastNode;
      if (futureCurrentNode == null) break;
      lastNode = currentNode;
      currentNode = futureCurrentNode;
    }
    return currentNode;
  }
}

class Reverse {
  static void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println();
  }

  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t > 0) {
      String str[] = read.readLine().trim().split(" ");
      int n = str.length;
      Node head = new Node(Integer.parseInt(str[0]));
      Node tail = head;

      for (int i = 1; i < n; i++) {
        tail.next = new Node(Integer.parseInt(str[i]));
        tail = tail.next;
      }

      Solution ob = new Solution();
      head = ob.reverseList(head);
      printList(head);
      t--;

      System.out.println("~");
    }
  }
}
