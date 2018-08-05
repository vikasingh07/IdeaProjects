public class Sumtwolists {
    private static ListNode head =null;
    public void addToTheLast(ListNode node) {

        if (head == null) {
            head = node;
        } else {
            ListNode temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    public void printList(ListNode printNode) {
        ListNode temp = printNode;
        while (temp != null) {
            System.out.format("%d ", temp.val);
            temp = temp.next;
        }
        System.out.println();
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        while(l1!=null || l2!=null){
            l1=l1.next;
            l2=l2.next;
        }

        int carry=0;
        int sum=0;

        while(l1.next!=null || l2.next!=null){

            sum=(l1.val+l2.val+carry);
            sum=sum%10;
            carry=sum/10;

            l3.val=sum;
            l3=l3.next;
        }

        return l3;
    }
}
