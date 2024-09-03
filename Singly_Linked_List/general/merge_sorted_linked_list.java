package Linked_List.Singly_Linked_List.general;


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

class merging
{
    Node solution(Node head1, Node head2)
    {
        if(head1==null)
        {
            return head2;
        }
        if(head2==null)
        {
            return head2;
        }
        Node head_pointer=null,tail_pointer=null;
        if(head1.data<head2.data)
        {
            head_pointer=tail_pointer=head1;
            head1=head1.next;
        }
        else
        {
            head_pointer=tail_pointer=head2;
            head2=head2.next;
        }
        while(head1!=null && head2!=null)
        {
            if(head1.data<=head2.data)
            {
                tail_pointer.next=head1;
                tail_pointer=head1;
                head1=head1.next;
            }
            else {
                tail_pointer.next=head2;
                tail_pointer=head2;
                head2=head2.next;
            }
        }
        if(head1==null)
        {
            tail_pointer.next=head2;
        }
        else
        {
            tail_pointer.next=head1;
        }
        return head_pointer;
    }
}
public class merge_sorted_linked_list {
    public static void main(String[] args) {
        Node head1=new Node(10);
        head1.next=new Node(20);
        head1.next.next=new Node(30);

        Node head2=new Node(5);
        head2.next=new Node(25);

        merging obj=new merging();
        Node newhead=obj.solution(head1,head2);
        Node curr=newhead;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }

    }
}
