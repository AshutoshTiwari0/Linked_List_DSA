package Linked_List.Singly_Linked_List.basics;
class Node3 {
    int data;
    Node3 next;

    Node3(int x) {
        data=x;
        next = null;
    }
}
public class recursivetraversal {
    void rprint(Node3 head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data);


        rprint(head.next);
    }
    public static void main(String[] args) {
    Node3 head=new Node3(10);
    head.next=new Node3(20);
    head.next.next=new Node3(30);


    }
}
