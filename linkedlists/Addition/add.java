import java.util.*;
public class add{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //adding at 1st 
    public void addfirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }
    //add at last
    public void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next = newnode;
        newnode.next=null; 
    }
    public void printlist(){
        Node temp = head;
      while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
      }
      System.out.print("null");
    }
    public void addatpos(int id,int data){
        Node newnode = new Node(data);
        Node temp=head;
        int i=1;
        if(id==1){
            addfirst(data);
            i++;
            return;
        }
        while(i<id-1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public static void main(String[] args){
      add ll = new add();
      ll.addfirst(2);
      ll.addfirst(1);
      ll.addlast(3);
      ll.addlast(4);
      ll.addatpos(3,100);
      ll.printlist();
    }
}