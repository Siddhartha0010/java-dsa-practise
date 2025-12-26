import java.util.*;
public class pushatbottom{
    public static void pushr(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushr(s,data);
        s.push(top);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        int item = sc.nextInt();
        pushr(stack,item);
        while(stack.isEmpty()!=true){
          System.out.print(stack.pop()+" ");
        }

    }
}