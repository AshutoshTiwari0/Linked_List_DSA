package Linked_List.Singly_Linked_List.deletion;

class Node8
    {
        int data;
        Node8 next;
        Node8(int x)
        {
            data=x;
            next=null;
        }

    }
    class deletion_at_last {
        Node8 deltail(Node8 head) {
            if(head==null)
            {
                return null;
            }
            if(head.next==null)
            {
                return null;
            }
            Node8 curr=head;
            while(curr.next.next!=null)
            {
                curr.next=null;

            }
            return head;
        }

        public void printList(Node8 head) {
       Node8 curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }

            System.out.println();
        }
    }


public class deletion_last {
        public static void main(String[] args) {
         Node8 head=new Node8(10);
         Node8 temp1=new Node8(20);
         Node8 temp2=new Node8(30);
         Node8 temp3=new Node8(40);
         Node8 temp4=new Node8(50);
         head.next=temp1;
         temp1.next=temp2;

         deletion_at_last obj=new deletion_at_last();
         obj.deltail(head);
         obj.printList(head);



        }
    }


