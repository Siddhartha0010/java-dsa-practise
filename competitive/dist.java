// import java.util.*;
// public class dist
// {

//      public static Object impact(int i1, int i2)
//     {
//         // i1 = liters
//         // i2 = distance in km

//         // 1. Invalid input check
//         if (i1 <= 0)
//         {
//             return i1 + " is an Invalid Input";
//         }
//         if (i2 <= 0)
//         {
//             return i2 + " is an Invalid Input";
//         }

//         double liters = i1;   
//         double distance = i2;

//         // 2. Liters per 100 km
//         double lt100 = (liters / distance) * 100.0;               

//         // 3. Convert km to miles
//         double dmiles = distance * 0.6214;

//         // 4. Convert liters to gallons
//         double f = liters * 0.2642;

//         // 5. Miles per gallon
//         double ans2 = dmiles / f;

//         // 6. Round both to 2 decimal places
//         lt100 = (lt100 * 100.0) / 100.0;           
//         ans2 = Math.round(ans2 * 100.0) / 100.0;           

//         double[] result = new double[2];
//         result[0] = lt100;
//         result[1] = ans2;

//         return result;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int input1 = sc.nextInt();
//         int input2 = sc.nextInt();
//          System.out.print(Arrays.toString(impact(input1,input2)));    
         
//     }
// }




import java.util.*;
public class dist{

    public static String[] fuel(int x,int y){
          double ans1 = (x*100.0)/y;
          double miles = y*0.6214;
          double gallons = x*0.2642;
          double ans2 = miles/gallons;
          ans1 = Math.round(ans1*100.0)/100.0;          // ans1 = 13.33789098      ans1*100= 1333.789098    round = 1333/100.0   ans= 13.33
          ans2 = Math.round(ans2*100.0)/100.0;
          String arr[]  = new String[2];
          arr[0] = "Ans1 is:"+ ans1;
          arr[1] = "Ans2 is: "+ ans2;

          return arr;
          
          
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int f = sc.nextInt();
        if(d<0){
            System.out.print(d +" is an Invalid Input");
        }
        else if(f<0){
            System.out.print(f +" is an Invalid Input");
        }
        else{
        String a[] = fuel(d,f);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        }
    }
}
