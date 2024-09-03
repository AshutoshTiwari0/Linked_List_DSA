package Linked_List.Doubly_Linked_List.Deletion;

    class Node2 {
        int data;
        Node2 prev;
        Node2 next;
        Node2(int x) {
            data=x;
            next = null;
            prev = null;
        }
    }
    class delete_heaad
    {
        Node2 del_head(Node2 head)
        {
            if(head==null)
            {
                return null;
            }
            if(head.next==null)
            {
                return null;
            }
            Node2 curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.prev.next=null;
            return head;
        }
    }


    public class delete_last {
        public static void main(String[] args) {
            delete_heaad obj=new delete_heaad();
            Node2 head=new Node2(10);
            Node1 obj1=new Linked_List.Doubly_Linked_List.Deletion.Node1(20);
            Node1 obj2=new Linked_List.Doubly_Linked_List.Deletion.Node1(30);
            obj.del_head(head);


        }
    }


