package linkedList;

public class LinkedList {

    static ListNode head;
    ListNode tail;
    public void add(int data){
        ListNode node = new ListNode(data);
        if(head==null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
    }

    public void printAll(){
        ListNode temp = head;

        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    class ListNode {
        int data;
        ListNode next;

        ListNode(){

        }
        ListNode(int data){
            this.data = data;
            next = null;
        }
    }
}
