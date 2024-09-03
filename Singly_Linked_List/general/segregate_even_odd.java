package Linked_List.Singly_Linked_List.general;

class Node1
{
    int x;
    Node1 next;
    Node1(int data)
    {
        x=data;
        next=null;
    }

}
class segregation
{
    Node1 solution(Node1 head)
    {
        Node1 curr=head;
        Node1 evenstart=null,oddstart=null,evenend=null,oddend=null;
        while(curr!=null) {
            if (curr.x % 2 == 0) {
                if (evenstart == null) {
                    evenstart = evenend = curr;
                } else {
                    evenend.next = curr;
                    evenend = evenend.next;
                }
            } else {
                if (oddstart == null) {
                    oddstart = oddend = curr;
                } else {
                    oddend.next = curr;
                    oddend = oddend.next;
                }
            }
            curr = curr.next;
        }
        if(oddstart==null|| evenstart==null)
        {
            return head;
        }
        else {
            evenend.next = oddstart;
            oddend.next = null;
            return evenstart;
        }
    }
}
public class segregate_even_odd {
    public static void main(String[] args) {
        Node1 head=new Node1(10);
        head.next=new Node1(5);
        head.next.next=new Node1(42);
        head.next.next.next=new Node1(84);
        head.next.next.next.next=new Node1(41);
        head.next.next.next.next.next=new Node1(53);

        segregation obj=new segregation();
        Node1 newhead=obj.solution(head);


        for(Node1 newlist=newhead;newlist!=null;newlist=newlist.next)
        {
            System.out.println(newlist.x);
        }
    }
}
