package Linked_List.Singly_Linked_List.insertion;

class Node6
{
    int data;
    Node6 next;
    Node6(int x)
    {
        data=x;
        next=null;
    }

}
class solution
{
    Node6 insert_at_given_pos(Node6 head,int pos, int data)
    {
        Node6 temp=new Node6(data);
        if(pos==1)
        {
            temp.next=head;
            return temp;
        }
        Node6 curr=head;
        for(int i=1;i<=pos-2 && curr!=null; i++)
        {
            curr=curr.next;
        }
        if(curr==null)
        {
            return head;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }

    public void printList(Node6 head){
        Node6 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}

public class insert_given_position
{
    public static void main(String[] args) {
        Node6 head = null;
        solution obj = new solution();

        head = obj.insert_at_given_pos(head, 1, 10); // Insert at position 1
        head = obj.insert_at_given_pos(head, 2, 20); // Insert at position 2
        head = obj.insert_at_given_pos(head, 1, 5);  // Insert at position 1 again
        head = obj.insert_at_given_pos(head, 4, 30);
        obj.printList(head);
    }
    }
