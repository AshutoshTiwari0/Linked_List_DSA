package Linked_List.Singly_Linked_List.basics;

class Node2
{
    int data;
    Node2 next;
    Node2(int x) {
        data=x;
        next=null;

    }
}

public class practice {
    public static void main(String[] args) {
      Node2 head=new Node2(5);
      head.next=new Node2(10);
      head.next.next=new Node2(45);

      //printing
        Node2 current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
}
