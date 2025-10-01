//Search for a key in a ll.Return the pos where it is found.If not found return -1
import java.util.*;
public class recursivell{
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

    public int helper(Node head, int key) {
    if(head == null) return -1;          // Base case: key not found
    if(head.data == key) return 0;       // Base case: key found at this node

    int idx = helper(head.next, key);    // Recursive call on the rest of the list
    if(idx == -1) return -1;             // Key not found in rest of the list
    return idx + 1;                      // Add 1 to index for current node
}

public int recsearch(int key) {
    return helper(head, key);
}

    public static void main(String[] args){
        recursivell ll = new recursivell();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int data = sc.nextInt();
            ll.addlast(data);
        }
        ll.print();
        System.out.print("Enter the key now:");
        int k = sc.nextInt();
        System.out.print(ll.recsearch(k));
    }
}