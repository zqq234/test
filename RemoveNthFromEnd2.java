public ListNode RemoveNthFromEnd2(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;
    for (int i = 1; i <= n + 1; i++) {
        first = first.next;

        if (first == null) {
          return dummy.next;
        }
    }
    while (first != null) {
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
    return dummy.next;
}

