import java.util.*;
public class Addatlast{
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
        Node newnode = new Node(data);
        if(head==null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();
    }
    public static void main(String[] args){
        Addatlast ll = new Addatlast();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            i = sc.nextInt();
            ll.addbeg(i);
        }
        ll.print();
        sc.close();
    }
}