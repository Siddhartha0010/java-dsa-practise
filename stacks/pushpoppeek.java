import java.util.*;
public class pushpoppeek{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isempty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);

        }
        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            int top = list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String[] args){
       Stack s = new Stack();
       s.push(1);
       s.push(2);
       s.push(3);
       while(Stack.isempty()!=true){
              System.out.println(s.pop());
       }

    }
}