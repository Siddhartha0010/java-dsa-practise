import java.util.*;
public class reverseStackusingRecursion{
   public static void pushatbottom(Stack<Integer> st,int data){
    if(st.isEmpty()){
        st.push(data);
        return;
    }
    int top = st.pop();
    pushatbottom(st,data);
    st.push(top);
   }
    public static void rev(Stack<Integer> st){
        if(st.isEmpty()){
             return;
        }
        int top = st.pop();
        rev(st);
        pushatbottom(st,top);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        rev(stack);
        while(stack.isEmpty()!=true){
            System.out.print(stack.pop()+" ");
        }


    }
}