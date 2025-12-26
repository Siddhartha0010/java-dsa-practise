import java.util.*;
public class reverseString{
    public static void rev(String str){
        int id=0;
       Stack<Character> st = new Stack<>();
       while(id<str.length()){
        st.push(str.charAt(id));
        id++;
       }
       StringBuilder sb = new StringBuilder();
       while(st.size()>0){
            sb.append(st.pop());
       }
       String strin = sb.toString();
       System.out.print(strin);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        rev(str);
    }
}