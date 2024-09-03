package Linked_List.Singly_Linked_List.insertion;

class Node4
{
    int data;
    Node4 next;
    Node4(int x)
    {
        data=x;
        next=null;
    }
}
class Test
{
    static Node4 InsertBegin(Node4 head,int x)
    {
        Node4 temp=new Node4(x);
        temp.next=head;
        return temp;
    }
    static void printList(Node4 head)
    {
        Node4 temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


}

public class Insertion_Begining {
    public static void main(String[] args) {
        Node4 head=null;
        Test obj=new Test();
        head=obj.InsertBegin(head,30);
        head=obj.InsertBegin(head,20);
        head=obj.InsertBegin(head,10);
        obj.printList(head);


    }
}