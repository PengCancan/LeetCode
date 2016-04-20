import java.util.LinkedList;

/**
 * Created by Shadow on 2016/3/30.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l1_1 = new ListNode(4);
        ListNode l1_2 = new ListNode(3);

        l1.next = l1_1;
        l1_1.next = l1_2;

        ListNode l2 = new ListNode(5);
        ListNode l2_1 = new ListNode(6);
//        ListNode l2_2 = new ListNode(4);

        l2.next = l2_1;
//        l2_1.next = l2_2;
//        while(l1 != null){
//            System.out.println(l1.val);
//            l1 = l1.next;
//        }
//        while(l2 != null){
//            System.out.println(l2.val);
//            l2 = l2.next;
//        }
        ListNode sum = new AddTwoNumbers().addTwoNumbers(l1, l2);
        while(sum != null){
            System.out.println(sum.val);
            sum = sum.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode( l1.val  + l2.val);
        int temp = 0;
        int flag = 0;
        while(l1.next != null && l2.next != null){
            l1 = l1.next;
            l2 = l2.next;
            temp = l1.val  + l2.val + flag;
            if(temp < 10){
                ListNode t = new ListNode(temp);
                ListNode tem = l;
                while(tem.next != null){
                    tem = tem.next;
                }
                tem.next = t;
            }else{
                int m = temp % 10;
                ListNode t = new ListNode(m);
                ListNode tem = l;
                while(tem.next != null){
                    tem = tem.next;
                }
                tem.next = t;
                flag = 1;
            }
        }
        if(temp > 10 && flag == 1){
            ListNode t = new ListNode(1);
            ListNode tem = l;
            while(tem.next != null){
                tem = tem.next;
            }
            tem.next = t;
        }
        return l;
    }
}
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}