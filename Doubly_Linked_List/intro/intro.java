package Linked_List.Doubly_Linked_List.intro;
class Node
{
    int data;
    Node prev;
    Node next;
    Node(int x)
    {
        data=x;
        /* we do not need to make prev and next as null*/
    }

}


public class intro {
    public static void main(String[] args) {
    Node head=new Node(10);
    Node temp1=new Node(20);
    Node temp2=new Node(30);

    head.next=temp1;
    temp1.prev=head;
    temp1.next=temp2;
    temp2.prev=temp1;

    printList(head);

    }
    public static void printList(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;

        }
    }

}
