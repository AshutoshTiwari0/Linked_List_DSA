package Linked_List.Singly_Linked_List.insertion;

class Node5
{
    int data;
    Node5 next;
    Node5(int x)
    {
        data=x;
        next=null;
    }
}
class test5
{
    public Node5 insertEnd(Node5 head, int x)
    {
        Node5 temp=new Node5(x);
    if(head==null)
    {
        return temp;
    }
    Node5 curr=head;
    while(curr.next!=null)
    {
        curr=curr.next;
    }
    curr.next=temp;
    return head;
    }

public void printlist(Node5 head){
    Node5 curr=head;
    while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
    System.out.println();
}
}
public class Insert_end {
    public static void main(String[] args) {
        Node5 head = null;
        test5 obj = new test5();
        head = obj.insertEnd(head, 10);
        head = obj.insertEnd(head, 20);
        head = obj.insertEnd(head, 30);

        obj.printlist(head);
    }
}
