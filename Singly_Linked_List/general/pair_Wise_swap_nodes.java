package Linked_List.Singly_Linked_List.general;


class Node2
{
    int data;
    Node2 next;
    Node2(int x)
    {
        data=x;
        next=null;
    }

}
class pairwise_swap_naive
{
   /* Node2 naive(Node2 head)
    {
        Node2 first=head;

        while(first!=null && first.next!=null)
        {
            //swap first and second data
            int t=first.data;
            first.data=first.next.data;
            first.next.data=t;
            first=first.next.next;


        }
        return head;
    }
    */

    Node2 optimised(Node2 head) //changing links instead of data
    {
        if(head==null || head.next==null)
        {
         return head;
        }
        //change the first two nodes explicitly
        Node2 curr=head.next.next;
        Node2 prev=head;
        head=head.next;
        head.next=prev;

        while(curr!=null && curr.next!=null)
        {
            prev.next=curr.next;
            prev=curr;
            Node2 next=curr.next.next;
            curr.next.next=curr;
            curr=next;
        }
        prev.next=curr; //for odd nodes last linkage and make even last node next as null.
        return head;

    }
}
public class pair_Wise_swap_nodes {
    public static void main(String[] args) {
        Node2 head=new Node2(1);
        head.next=new Node2(2);
        head.next.next=new Node2(3);
        head.next.next.next=new Node2(4);
        head.next.next.next.next=new Node2(5);
        head.next.next.next.next.next=new Node2(6);




        pairwise_swap_naive obj=new pairwise_swap_naive();
        //Node2 newhead=obj.naive(head);
        Node2 newhead=obj.optimised(head);
        while(newhead!=null)
        {
            System.out.println(newhead.data);
            newhead=newhead.next;
        }

    }
}
