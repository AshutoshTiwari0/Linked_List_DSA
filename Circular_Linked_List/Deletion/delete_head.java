package Linked_List.Circular_Linked_List.Deletion;



class Node2
{
    int data;Node2 next;
    Node2(int x)
    {
        data =x;
        next=null;
    }
}

class delete_head_circular
{
    Node2 del_head(Node2 head) {
        /*naive
        if(head==null)
        {
            return null;
        }
        if(head.next==head) //single node
        {
            return null;
        }
        Node2 curr=head;
        while(curr.next!=head)
        {
            curr=curr.next;
        }
        curr.next=head.next;
        return curr.next;

*/
        //optimised

        if (head == null) {
            return null;
        }
        if (head.next == head) {
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    void print(Node2 head)
    {
        if (head == null) {
            return;
        }
        //explicitly printed head
        System.out.print(head.data + " ");

        for (Node2 i = head.next; i != head; i = i.next) {
            System.out.print(i.data + " "); //printing rest data other than head.
        }
    }
}



public class delete_head {
    public static void main(String[] args) {
        Node2 head=new Node2(10);
        head.next=new Node2(20);
        head.next.next=new Node2(30);
        head.next.next.next=new Node2(40);

        //making it circular
        head.next.next.next.next=head;


        delete_head_circular obj=new delete_head_circular();
        head=obj.del_head(head);

        obj.print(head);



    }
}
