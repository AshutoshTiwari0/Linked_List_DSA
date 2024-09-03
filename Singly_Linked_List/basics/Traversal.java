package Linked_List.Singly_Linked_List.basics;
class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}

public class Traversal {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        printList(head);
    }
    public static void printList(Node head)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }

}
