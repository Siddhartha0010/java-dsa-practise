import java.util.*;
public class Addatbeg{
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

    public void addbeg(int data){
        Node newnode = new Node(data); //creation of newnode
        if(head==null){
            head = tail = newnode;
        }else{

        
        newnode.next = head;
        head = newnode;
        }


    }
    public void printfn(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
      Addatbeg  ll = new Addatbeg();
      ll.addbeg(1);
      ll.addbeg(0);
      ll.addbeg(-1);
      ll.printfn();
    }
}