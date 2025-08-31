import java.util.*;
public class headtail{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
    
        headtail ll = new headtail();
        ll.head = new Node(n);
        ll.head.next = new Node(n1);
        ll.head.next.next = new Node(n2);
         ll.head.next.next.next = new Node(n3); // link n3 properly
        ll.tail = ll.head.next.next.next; // set tail correctly

        //Printing
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}