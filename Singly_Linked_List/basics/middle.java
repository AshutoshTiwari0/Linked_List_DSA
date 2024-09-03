package Linked_List.Singly_Linked_List.basics;


class Node4
{
    int x;
    Node4 next;
    Node4(int data)
    {
       x=data;
       next=null;
    }
}


class get_middle_node
{
    void middle_data(Node4 head)
    {
      /* //naive solution
        if(head==null)
        {
            return;
        }
        int count=0;
        Node4 curr;
        for(curr=head;curr!=null;curr=curr.next)
        {
            count++;
        }
        curr=head;
        for(int i=0;i<count/2;i++)
        {
            curr=curr.next;
        }
        System.out.println(curr.x);
        */

        /*optimised-> slow and fast pointer method
        slow moves one place at a time
        fast moves two place at a time
        ===WHEN FAST REACHES END SLOW WILL BE AT MIDDLE.===
         */
        Node4 slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        System.out.println(slow.x);
    }

}
public class middle {
    public static void main(String[] args) {
        Node4 head=new Node4(10);
        head.next=new Node4(5);
        head.next.next=new Node4(20);
        head.next.next.next=new Node4(15);
        head.next.next.next.next=new Node4(25);

        get_middle_node obj=new get_middle_node();
        obj.middle_data(head);





    }
}
