import java.util.*;
public class swap2nos{
    public static void main(String[] args){
        ArrayList<Integer> var = new ArrayList<>();
        var.add(1);
        var.add(2);
        var.add(3);
        var.add(4);
        int id1 = 2;
        int id2 = 3;
        int temp = var.get(id1);
        var.set(id1,var.get(id2));
        var.set(id2,temp);
        for(int i=0;i<var.size();i++){
            System.out.println(var.get(i));
        }
    }
}