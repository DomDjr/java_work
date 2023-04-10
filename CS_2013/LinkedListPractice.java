
public class LinkedListPractice {

    private LinkedListPractice(){}

    public static void main(String[] args) {
        // Test all methods here



        ListNode list1 = ListUtils.arrayToLinkList(new int[]{2, 7, 8, 11, 30});
        ListNode list2 = ListUtils.arrayToLinkList(new int[]{0, 1, 9, 11});
        ListNode list3 = ListUtils.arrayToLinkList(new int[]{0,1,1,2,2,3});

        ListNode mergedList = mergeLists(list1, list2);
        ListUtils.displayList(mergedList);

        ListNode deleteDupe = deleteDuplicates(list3);
        ListUtils.displayList(deleteDupe);

    }
    /**
     * Given the heads of two sorted linked lists, merges the two lists in a one sorted list.
     * The list is made by splicing together the nodes of the original two lists, without
     * creating any new nodes.
     *
     * Returns the head of the merged linked list.
     */
    public static ListNode sortList(ListNode head1) {
        /*
        ListNode head = head1;
        ListNode curr = head1.next;
        ListNode temp;
        ListNode realHead = null;

        while (head1 != null) {
            if (curr.val < head1.val) {
                temp = curr;
                realHead = temp;
                curr = head.next;
                head = head.next;
            }
        }

         */
        return head1;
    }

    public static ListNode mergeLists(ListNode head1, ListNode head2) {
        ListNode head;
        ListNode curr;

        if(head1.val <= head2.val) {
            head = head1;
            head1 = head1.next;
        }
        else {
            head = head2;
            head2 = head2.next;
        }

        curr = head;

        while(head1 != null && head2 != null) {
            if(head1.val < head2.val) {
                curr.next = head1;
                head1 = head1.next;
            }

            else {
                curr.next = head2;
                head2 = head2.next;
            }

            curr = curr.next;

        }

        if(head1 != null) {
            curr.next = head1;
        }

        if(head2 != null) {
            curr.next = head2;
        }

        return head;
    }

    /**
     * Given the head of a sorted linked list, deletes all duplicates such that each element appears only once.
     *
     * Returns the head of the resulting linked list, which is still sorted.
     */
    public static ListNode deleteDuplicates(ListNode head1) {
       ListNode head = head1;
        if(head == null || head.next == null) {
            return null;
        }
        while(head != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            }
            else {
                head = head.next;
            }
        }
        return head;
    }

    /**
     * Given the head of a linked list and an integer val, removes all the nodes of the linked list that has
     * Node.val == val.
     *
     * Returns the head of the resulting list.
     */
    public static ListNode removeElements(ListNode head, int val) {

        ListNode newHead = head;

        if(newHead == null || newHead.next == null) {
            return null;
        }

        while(newHead != null) {
            if(head.val == val) {
                newHead = newHead.next.next;
            }
        }

        return head;
    }

    /**
     * Given the head of a zero-indexed linked list and two indices i and j, swaps the elements at these indices.
     *
     * Returns the head of the resulting list.
     */
    public static ListNode swapElements(ListNode head, int i, int j) {
        int firstIndex = i;
        int secondIndex = j;


        ListNode tempNode;
        int tempVal;

        ListNode head1 = head;

        int index = 0;

        if(head1 == null || head1.next == null) {
            return null;
        }

        for (int k = 0; k <= firstIndex || k <= secondIndex; k++) {
            if (head1.next.val == firstIndex) {
                tempVal = head1.val;


            }
        }

        return null;
    }


    /**
     * Given the head of a singly linked list, reverse the list, and return the reversed list.
     */
    public static ListNode reverseList(ListNode head) {
        return null;
    }

    /**
     * Given the head of a singly linked list, returns the middle node of the linked list.
     *
     * If there are an even number of elements -- and thus two middle nodes -- returns the second middle node.
     */
    public static ListNode middleNode(ListNode head) {
        return null;
    }


}
