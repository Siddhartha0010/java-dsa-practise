import java.util.*;
public class arraystack {
    public  class Stackarr{
        int arr[] = new int[5];
        int top = -1;
        void push(int x){
            if(top==4){
                System.out.print("Overflow");
            }
            arr[++top] = x;
        }
        int pop(){
            if(top==-1){
                System.out.print("Underflow");
                return -1;
            }
            return arr[top--];
        }
        int peek(){
            if(top==-1){
                return -1;
            }
            return arr[top];
        }
        int size(){
            return top+1;
        }
        boolean isEmpty(){
           return top==-1;
        }
           
    }
    public static void main(String[] args){
           Stackarr st = new Stackarr();
           st.push(10);
           st.push(20);
           st.push(30);
           System.out.println(st.pop());
           System.out.println(st.peek());
           System.out.println(st.isEmpty());
           System.out.println(st.size());
    }
}
