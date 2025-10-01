import java.util.*;
public class removefirst{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
  
    public void addlast(int data){
       Node newnode = new Node(data);
       if(head==null){
            head=tail=newnode;
        }
        else{
       tail.next = newnode;
       tail=newnode;
        }
    }
    public void deletefirst(){
        if(head==null){
            head=tail=null;
            System.out.print("Empty");
            return;
        }
        int val = head.data;
        System.out.print(val);
        head = head.next;
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){
       removefirst ll = new removefirst();
       ll.addlast(1);
       ll.addlast(2);
       ll.addlast(3);
       ll.addlast(4); 
       ll.deletefirst();
       
    }
}