import java.util.*;
public class maxcontainer_2pointer_approach{
    public static int areatwopointer(ArrayList<Integer> var){
          int lp = 0;
          int rp = var.size()-1;
          int maxele = 0;
          int min,len,area;
          while(lp<rp){
             min = Math.min(var.get(lp),var.get(rp));
             len = rp-lp;
             area = min*len;
             maxele = Math.max(area,maxele);

             if(lp<rp){
                lp++;
             }
             else{
                rp--;
             }
          }
          return maxele;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.print(areatwopointer(list));
    }
}