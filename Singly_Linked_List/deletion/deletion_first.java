package Linked_List.Singly_Linked_List.deletion;
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
class deletion {
    Node6 delhead(Node6 head) {
        if (head == null) {
            return null;
        } else {
            return head.next;
        }
    }

    public void printList(Node6 head) {
        Node6 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}


public class deletion_first {
    public static void main(String[] args) {
        Node6 head=new Node6(10);
        Node6 temp1=new Node6(20);
        Node6 temp2=new Node6(30);

        head.next=temp1;
        temp1.next=temp2;

        deletion obj=new deletion();
        head=obj.delhead(head);
        obj.printList(head);



    }
}
