package Linked_List.Circular_doubly;


import java.util.Scanner;

class Node1
{ int x;Node1 next; Node1 prev;
    Node1(int data)
    {
         x=data;
         prev=null;
         next=null;
    }
}

class insert_head
{
    /*insert at head
    Node1 insert(int x, Node1 head)
    {
        Node1 temp=new Node1(x); //created a node for our data
        if(head==null)
        {
            temp.next=temp;
            temp.prev=temp; //self linking
            return temp;
        }

        temp.prev=head.prev; //in a circular doubly head.prev gives the last node

        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return temp;
    }
    */
     //insert at end
    Node1 insert(int x, Node1 head)
    {
        Node1 temp=new Node1(x); //created a node for our data
        if(head==null)
        {
            temp.next=temp;
            temp.prev=temp; //self linking
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;

        return temp;

    }


    void printlist(Node1 head){
        if(head==null)return;
        Node1 r=head;
        do{
            System.out.print(r.x+" ");
            r=r.next;
        }while(r!=head);
    }

}


public class intro {
    public static void main(String[] args) {
        Node1 head=new Node1(10);
        Node1 temp1=new Node1(20);
        Node1 temp2=new Node1(30);
        Node1 temp3=new Node1(40);
        //linking them
        head.next=temp1;
        head.prev=temp3;

        temp1.next=temp2;
        temp1.prev=head;

        temp2.next=temp3;
        temp2.prev=temp1;

        temp3.next=head;
        temp3.prev=temp2;


        //System.out.println("enter data to insert at head");
        System.out.println("enter data to insert at end");
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();

        insert_head obj=new insert_head();
        obj.insert(a,head);

        obj.printlist(head);




/*Advantages->
1.all advantages of circular and doubly
2. last node access in constant time
 */



    }
}
