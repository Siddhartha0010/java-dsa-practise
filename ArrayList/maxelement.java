import java.util.*;
public class maxelement{
    public static void main(String[] args){
        ArrayList <Integer> var = new ArrayList<>();
        var.add(1);
        var.add(9);
        var.add(3);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<var.size();i++){
            max = Math.max(max,var.get(i));
        }
        System.out.print(max);
    }
}