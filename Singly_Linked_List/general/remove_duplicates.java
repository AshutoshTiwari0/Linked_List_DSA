package Linked_List.Singly_Linked_List.general;



class Node11
{
    int data;
    Node11 next;
    Node11(int x)
    {
        data=x;
        next=null;
    }


}


class remove_duplicates_soltuion
{
    Node11 remove_duplicates_function(Node11 head)
    {
    Node11 curr=head;
    while(curr!=null && curr.next!=null)
    {
        if(curr.data==curr.next.data)
        {
            curr.next=curr.next.next;
        }
        else {
            curr=curr.next;
        }
    }
    return head;
    }
}



public class remove_duplicates {
    public static void main(String[] args) {
        Node11 head=new Node11(10);
        head.next=new Node11(20);
        head.next.next=new Node11(20);
        head.next.next.next=new Node11(30);
        head.next.next.next.next=new Node11(30);
        head.next.next.next.next.next=new Node11(30);

        remove_duplicates_soltuion obj=new remove_duplicates_soltuion();
        Node11 newhead=obj.remove_duplicates_function(head);
        Node11 curr=newhead;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }


    }
}
