import java.util.*;
public class reversell{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    public static  Node head;
    public static Node tail;

    public void addfirst(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void printlist(){
        Node temp = head;
      while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
      }
      System.out.println("null");
      
    }

    public void revll(){
       Node prev = null;
       Node curr =tail= head;
       Node next;

       while(curr!=null){
          next = curr.next;
          curr.next = prev;     // main line of reversing
          prev = curr;
          curr=next;
       }
       head=prev;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        reversell ll = new reversell();
      ll.addfirst(4);
      ll.addfirst(3);
      ll.addfirst(2);
      ll.addfirst(1);
      ll.printlist();
      ll.revll();
      ll.printlist();
    }
}