#include <bits/stdc++.h>
using namespace std;

struct Node {
  int data;
  struct Node *next;
  Node(int x) {
    data = x;
    next = NULL;
  }
};

class Solution {
 public:
  struct Node *reverseList(struct Node *head) {
    if (!head) return NULL;
    if (!head->next) return head;
    Node *last_node{head}, *current_node{head->next};
    last_node->next = NULL;
    while (current_node) {
      Node *future_current_node = current_node->next;
      current_node->next = last_node;
      if (!future_current_node) break;
      last_node = current_node;
      current_node = future_current_node;
    }
    return current_node;
  }
};

void printList(struct Node *head) {
  struct Node *temp = head;
  while (temp != NULL) {
    printf("%d ", temp->data);
    temp = temp->next;
  }
}

int main() {
  int T, n, l, firstdata;
  cin >> T;
  cin.ignore();
  while (T--) {
    struct Node *head = NULL, *tail = NULL;
    vector<int> arr;
    string input;
    getline(cin, input);
    stringstream ss(input);
    int number;
    while (ss >> number) {
      arr.push_back(number);
    }
    int index = 0;
    n = arr.size();
    if (n != 0) {
      head = new Node(arr[0]);
      tail = head;
    }
    for (int i = 1; i < n; i++) {
      l = arr[i];
      tail->next = new Node(l);
      tail = tail->next;
    }
    Solution ob;
    head = ob.reverseList(head);
    printList(head);
    cout << endl;
    cout << "~" << endl;
  }
  return 0;
}