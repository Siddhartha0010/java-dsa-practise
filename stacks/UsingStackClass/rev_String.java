import java.util.*;
public class rev_String {
    public static void main(String[] args){
        Stack<Character> st = new Stack<>();
        String str = "hello";
        for(char c: str.toCharArray()){
            st.push(c);
        }
        while(!st.isEmpty()){
             System.out.print(st.pop());
        }
        
    }
}
