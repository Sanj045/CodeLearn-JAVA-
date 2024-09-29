public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Handle base cases
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        // Compare values and merge accordingly
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        // Create first sorted linked list: 1 -> 2 -> 4
        ListNode list1 = solution.new ListNode(1);
        list1.next = solution.new ListNode(2);
        list1.next.next = solution.new ListNode(4);

        // Create second sorted linked list: 1 -> 3 -> 4
        ListNode list2 = solution.new ListNode(1);
        list2.next = solution.new ListNode(3);
        list2.next.next = solution.new ListNode(4);

        // Merge the two lists
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged linked list
        printList(mergedList);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}