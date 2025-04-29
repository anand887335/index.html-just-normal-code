// public class insortSort {

//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
//     int arr[]={7,8,9,4,2,1};
//     for(int i=1; i<arr.lenght; i++){
//         int current=arr[i];
//         int j=i-1;
//         while (j>=0 && current<arr[j]) {
//             arr[j+1]=arr[j];
//             j--;
//             arr[j]=current;
//         }
// printArray(arr);
//     }
// }
public class insortSort {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.err.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]= {7,8,2,3,1};
        for(int i=1; i<arr.length; i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current < arr[j]) {
                arr[j+1]=arr[j];
                j--;                
            }
            arr[j+1]=current;
        }
        printArray(arr);
    }
}