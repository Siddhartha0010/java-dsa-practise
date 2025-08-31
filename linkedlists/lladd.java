public class lladd{
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
    public void addfirst(int data){
      Node newnode = new Node(data);
      if(head==null){
        head=tail=newnode;
      }
      newnode.next=head;
      head = newnode;
    }
    public void addlast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail=newnode;
        }
        newnode.next=tail;
        tail=newnode;
    }
    public void addpos(int data,int pos){
        Node newnode = new Node(data);
        if(pos ==1){
            addfirst(data);
            return;
        }
        Node temp = head;
        int i=1;
        while(i<pos-1 && temp!=null){
           temp = temp.next;
           i++;
        }
        if(temp==null || temp.next==null){
            addlast(data);
            return;
        }
         newnode.next = temp.next;
            temp.next = newnode;

    }
    public void printlist(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        lladd ll = new lladd();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addlast(4);
        ll.addlast(3);
        ll.addpos(6,2);
        ll.printlist();
    }
}