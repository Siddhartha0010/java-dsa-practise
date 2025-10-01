import java.util.*;
public class addlast{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addlast(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = tail = newnode;
            return;
        }
         tail.next = newnode;  // link new node at the end
        tail = newnode;       // update tail
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();
    }
    public static void main(String[] args){
        addlast ll = new addlast();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int data = sc.nextInt();
            ll.addlast(data);
        }
        ll.print();
    }
}