import java.util.*;
public class max{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int maxi = Integer.MIN_VALUE;
        int maxf =0;
        for(int i=0;i<list.size();i++){
              for(int j=i+1;j<list.size();j++){
                        if(list.get(i)>list.get(j)){
                            maxi = list.get(i);
                        } 
              }
               if(maxi>maxf){
                maxf = maxi;
               }
        }
        System.out.print(maxf);
    }
}