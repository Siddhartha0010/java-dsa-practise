import java.util.*;
public class removelast{
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
            }
            else{
            tail.next = newnode;
            tail = newnode;
            }
            
        }

        public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

        public void removelast(){
            if(head==null || head.next==null){
                head=tail=null;
                return;
            }
            Node temp=head;
            
            while(temp.next.next!=null){         ///or temp.next!=tail   which stops at last 2nd node
                temp=temp.next;
            }
            temp.next = null;
            tail = temp;
        }
        
    
    public static void main(String[] args){
        System.out.print("Enter size:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        removelast ll = new removelast();
        for(int i=0;i<n;i++){
            System.out.print("Enter value "+i+": ");
            int data = sc.nextInt();
            ll.addlast(data);
        }
        ll.removelast();
        ll.print();

    }
}