package Linked_List.Circular_Linked_List;
class Node2
{
    int data;
    Node2 next;
    Node2(int d)
    {
      data=d;
      next=null;
    }
}
class solution
{
   /* void traversal(Node2 head)
    {
        if(head==null)
        {
            return;
        }
        //explicitly printed head
        System.out.print(head.data+" ");

        for(Node2 i=head.next;i!=head;i=i.next)
        {
            System.out.print(i.data+" "); //printing rest data other than head.
        }
    }
    */
    //method2
    void traversal(Node2 head)
    {
        if(head==null)
        {
            return;
        }
        Node2 r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }
        while(r!=head);
    }
}

public class traversal {
    public static void main(String[] args) {
        //creation
        Node2 head=new Node2(10);
        head.next=new Node2(20);
        head.next.next=new Node2(30);
        head.next.next.next=head;

        solution obj=new solution();
        obj.traversal(head);





    }
}
