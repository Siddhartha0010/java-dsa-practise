// from given array print the container with highest water(area)
//eg: inp: 1,,8,6,2,5,4,8,3,7
//op: 49                                area= h*b = (min(arr[i],arr[j]))* (i-j)

import java.util.*;
public class maxcontainer{
    public static void area(ArrayList<Integer> list){
        int breadth= 0;
        int area;
        int len;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                breadth = Math.min(list.get(i),list.get(j));
                len = j-i;
                area = breadth*len;
                max = Math.max(area,max);
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter "+i+" element: ");
             list.add(sc.nextInt());
        }
        area(list);
    }
}