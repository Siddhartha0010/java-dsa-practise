import java.util.*;
public class rainwatertrapping{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];    //eg: 4,2,3,6,3,5
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        } 
        //1)find the water level    water level = min(maxleftblock,maxrightblock);
        int leftaux[] = new int[n];
        leftaux[0] = height[0];
        for(int i=1;i<n;i++){
          leftaux[i] = Math.max(leftaux[i-1], height[i]);
        }
        int rightaux[] = new int[n];
        rightaux[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightaux[i] = Math.max(rightaux[i+1],height[i]);
        }
        

        int watertrapped = 0;
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftaux[i],rightaux[i]);
            watertrapped = watertrapped+ (waterlevel-height[i]);
        }
        System.out.print(watertrapped);
    }
}