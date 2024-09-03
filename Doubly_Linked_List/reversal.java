package Linked_List.Doubly_Linked_List;
class Node3
{ int data;
    Node3 next,prev;
    Node3(int x)
    {
        data=x;
        prev=null;
        next=null;
    }
}
class solution
{
    Node3 reverse(Node3 head)
    {
        if(head==null|| head.next==null)
        {
            return head;
            //if list is empty or only having single length
        }
        Node3 prev=null,curr=head;
        while(curr!=null)
        {
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }

}


public class reversal {
    public static void main(String[] args) {
    Node3 head=new Node3(10);
    Node3 temp1=new Node3(20);
    Node3 temp2=new Node3(30);
    Node3 temp3=new Node3(40);

    solution obj=new solution();
    head=obj.reverse(head);

       printList(head);
    }

    static void printList(Node3 head) {
        Node3 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;

        }
    }
}
