#include <bits/stdc++.h>
using namespace std;
struct Node {
  int data;
  struct Node* next;
  Node(int x) {
    data = x;
    next = NULL;
  }
};

void printList(Node* node) {
  while (node != NULL) {
    cout << node->data % 10;
    node = node->next;
  }
  cout << "\n";
}

class Solution {
 public:
  Node* reverseList(Node* head) {
    if (head == nullptr || head->next == nullptr) return head;
    Node* previous = nullptr;
    Node* current = head;
    while (current != nullptr) {
      Node* nextNode = current->next;
      current->next = previous;
      previous = current;
      current = nextNode;
    }
    return previous;
  }

  Node* addOne(Node* head) {
    Node* reversedHead = reverseList(head);
    Node* currentNode = reversedHead;
    Node* prevNode = nullptr;
    int carry = 1;

    while (currentNode != nullptr) {
      int sum = currentNode->data + carry;
      currentNode->data = sum % 10;
      carry = sum / 10;
      prevNode = currentNode;
      currentNode = currentNode->next;
    }

    if (carry != 0) {
      prevNode->next = new Node(carry);
    }

    return reverseList(reversedHead);
  }
};

int main() {
  int t;
  cin >> t;
  cin.ignore();
  while (t--) {
    vector<int> arr;
    string input;
    getline(cin, input);
    stringstream ss(input);
    int number;
    while (ss >> number) {
      arr.push_back(number);
    }

    if (arr.empty()) {
      cout << -1 << endl;
      continue;
    }

    int data = arr[0];
    struct Node* head = new Node(data);
    struct Node* tail = head;
    for (int i = 1; i < arr.size(); ++i) {
      data = arr[i];
      tail->next = new Node(data);
      tail = tail->next;
    }
    Solution ob;
    head = ob.addOne(head);
    printList(head);
    cout << "~" << endl;
  }
  return 0;
}