package Linked_List.Doubly_Linked_List.Deletion;


class Node1 {
    int data;Node1 prev;Node1 next;
    Node1(int x) {
         data=x;
         next = null;
         prev = null;
    }
}
class delete_head
{
Node1 del_head(Node1 head)
{
if(head==null)
{
    return null;
}
if(head.next==null)
{
    return null;
}
else
{
    head=head.next;
    head.prev=null;
    return head;

}
}
}


public class deletehead {
    public static void main(String[] args) {
        delete_head obj=new delete_head();
        Node1 head=new Node1(10);
        Node1 obj1=new Node1(20);
        Node1 obj2=new Node1(30);
        obj.del_head(head);


    }
}
