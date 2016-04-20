package com.list;

/**
 * Created by Shadow on 2016/4/6.
 */
public class BaseList {
    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(4);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        BaseList bl = new BaseList();
        bl.list(a1);
        Node t = null;
        t = bl.deleteLastKthNum(a1,3);
        bl.list(t);
    }

    public Node  deleteLastKthNum(Node list,int k){
        if (list == null){
            System.out.println("list is empty");
        }
        Node temp = list;
        while(temp != null){
            k--;
            temp = temp.next;
        }

        if (k == 0){
            list = list.next;
        }
        if (k<0){
            temp = list;
            while(++k != 0){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        return list;
    }
    public void list(Node list){
        if(list == null){
            System.out.println("list is empty");
        }
        while(list != null){
            System.out.println(list.data);
            list = list.next;
        }
    }
}

class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
    }

}
