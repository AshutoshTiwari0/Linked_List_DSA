package Linked_List.Singly_Linked_List.general;


class Node5
{
    int data;
    Node5 next,random;
    Node5(int x)
    {
        data = x;
        next = random = null;
    }
}

class clone
{
Node5 solution(Node5 head)
{
      /* HashMap<Node5,Node5> nums=new HashMap<>();
       for(Node5 curr=head;curr!=null;curr=curr.next)
       {
           nums.put(curr, new Node5(curr.data));
       }
       for(Node5 curr=head;curr!=null;curr=curr.next)
       {
           Node5 clone=nums.get(curr);
           clone.next=nums.get(curr.next);
           clone.random=nums.get(curr.random);

       }
       return nums.get(head);
       */
    Node5 next,temp;
    for(Node5 curr=head;curr!=null;){
        next=curr.next;
        curr.next=new Node5(curr.data);
        curr.next.next=next;
        curr=next;
    }
    for(Node5 curr=head;curr!=null;curr=curr.next.next){
        curr.next.random=(curr.random!=null)?(curr.random.next):null;
    }

    Node5 original = head, copy = head.next;

    temp = copy;

    while (original!=null && copy!=null)
    {
        original.next =
                original.next!=null? original.next.next : original.next;

        copy.next = copy.next!=null?copy.next.next:copy.next;
        original = original.next;
        copy = copy.next;
    }

    return temp;

}
}
public class clone_with_random_pointer {
    public static void main(String[] args) {
        Node5 head = new Node5(10);
        head.next = new Node5(5);
        head.next.next = new Node5(20);
        head.next.next.next = new Node5(15);
        head.next.next.next.next = new Node5(20);

        head.random = head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;

        clone obj=new clone();
        Node5 copyhead=obj.solution(head);

        while(copyhead!=null)
        {
            System.out.println(copyhead.data);
            copyhead=copyhead.next;
        }

    }
}
