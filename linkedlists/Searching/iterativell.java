//Search for a key in a ll.Return the pos where it is found.If not found return -1
import java.util.*;
public class iterativell{
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

    public int itrsearch(int key){
        Node temp = head;
        int i =0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;

    }
    public static void main(String[] args){
        iterativell ll = new iterativell();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int data = sc.nextInt();
            ll.addlast(data);
        }
        ll.print();
        System.out.print("Enter the key now:");
        int k = sc.nextInt();
        System.out.print(ll.itrsearch(k));
    }
}