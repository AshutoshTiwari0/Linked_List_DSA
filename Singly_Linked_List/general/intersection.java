package Linked_List.Singly_Linked_List.general;

class Node13
{
    Node13 next; int data;
    Node13(int x)
    {
        data=x;
        next=null;
    }

}
/*
class method1
{
    int hashing_solution(Node13 head1,Node13 head2)
    {
        HashSet<Node13> nums=new HashSet<>();
        for(Node13 curr=head1;curr!=null;curr=curr.next)
        {
            if(!nums.contains(curr))
            {
                nums.add(curr);
            }
        }

        for(Node13 curr=head2;curr!=null;curr=curr.next)
        {
            if(nums.contains(curr))
            {
                return 1;
            }
        }
        return 0;
    }

}
*/


class method2
{
    int second_solution(Node13 head1,Node13 head2)
    {
        /*
        Solution
        step1-> find length of both the lists
        step2-> Suppose the counts are C1 and C2
        step3-> traverse the bigger list abs(c1-c2) times
        step4-> now traverse both the lists simultaneously untill they point to a common node.
         */
        int c=0,d=0;
        for(Node13 curr=head1;curr!=null;curr=curr.next)
        {
            c++;
        }
        for(Node13 curr=head2;curr!=null;curr=curr.next)
        {
            d++;
        }
        int diff = Math.abs(c - d);

        // Align the longer list
        if (c > d) {
            for (int i = 0; i < diff; i++) {
                head1 = head1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                head2 = head2.next;
            }
        }

        // Traverse both lists together and check for intersection
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return 1; // Intersection found
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return 0; // No intersection



    }

}

public class intersection {
    public static void main(String[] args) {

        Node13 newNode;
        Node13 head1 = new Node13(10);

        Node13 head2 = new Node13(3);

        newNode = new Node13(6);
        head2.next = newNode;

        newNode = new Node13(9);
        head2.next.next = newNode;

        newNode = new Node13(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node13(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

       // method1 obj=new method1();
       //int ans= obj.hashing_solution(head1,head2);


        method2 obj=new method2();
        int ans=obj.second_solution(head1,head2);
        if(ans==1)
        {
            System.out.println("true there is a intersection");
        }
        else {
            System.out.println("no intersection");
        }



    }
}
