// public class RecuFib {
//     public static void printFib(int a ,  int b,int  n){
//         if(n==0){
//             return;
//         }
//         int c=a+b;
//         System.out.println(c);
//         printFib(b, c, n-1);
           
//     }
//     public static void main (String [] args){
//         int a=0;
//         int b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=7;
//         printFib(a, b, n-2);


//     }
// }
public class RecuFib {
public static int calcPown(int x , int n){
    if(n==0){
        return 1 ;
    }
    if(x==0){
        return 0;
    }
    int Pownm1= calcPown(x, n-1);
    int xPown = x * Pownm1;
    return xPown;
}
public static void main(String[] args) {
    int x=4 , n=2;
    int ans= calcPown(x, n);
    System.out.println(ans);
}
}