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
  public static Node reverseList(Node head) {
    if (head == null || head.next == null) return head;
    Node previous = null;
    Node current = head;
    while (current != null) {
      Node nextNode = current.next;
      current.next = previous;
      previous = current;
      current = nextNode;
    }
    return previous;
  }

  public Node addOne(Node head) {
    Node reversedHead = reverseList(head);
    Node currentNode = reversedHead;
    Node prevNode = null;
    int carry = 1;
    while (currentNode != null) {
      int sum = currentNode.data + carry;
      currentNode.data = sum % 10;
      carry = sum / 10;
      prevNode = currentNode;
      currentNode = currentNode.next;
    }
    if (carry != 0) prevNode.next = new Node(carry);
    return reverseList(reversedHead);
  }
}

class AddOneLL {
  public static void printList(Node node) {
    while (node != null) {
      System.out.print(node.data);
      node = node.next;
    }
    System.out.println();
  }

  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      String str[] = read.readLine().trim().split(" ");
      int n = str.length;
      Node head = new Node(Integer.parseInt(str[0]));
      Node tail = head;
      for (int i = 1; i < n; i++) {
        tail.next = new Node(Integer.parseInt(str[i]));
        tail = tail.next;
      }
      Solution obj = new Solution();
      head = obj.addOne(head);
      printList(head);
      System.out.println("~");
    }
  }
}
