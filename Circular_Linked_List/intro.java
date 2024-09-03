package Linked_List.Circular_Linked_List;


class Node1
{
    Node1 next;
    int data;
    Node1(int d) {
        data = d;
        next = null;
    }
}

public class intro {
    public static void main(String[] args) {
        Node1 head=new Node1(10);
        head.next=new Node1(20);
        head.next.next=new Node1(30);
        head.next.next.next=new Node1(40);

        //main part for circular linked list
        head.next.next.next.next=head;
    }
}
