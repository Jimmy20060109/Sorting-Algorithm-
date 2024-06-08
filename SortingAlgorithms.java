import java.util.*;
public class SortingAlgorithms {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[7];
        for(int i = 0 ; i < 7; i++){
            arr[i] = 6-i;
        }
        BubbleSort(arr);
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] BubbleSort(int [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr.length - 1; k++){
                if(arr[k] > arr[k+1]){
                    int a = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = a;
                }
            }
        }
        return arr;
    }
    public static int [] SelectSort(int [] arr){
        for(int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int k  = i; k < arr.length; k++){
                if(arr[k] < min){
                    min = arr[k];
                    index = k;
                }
            }
            int a = arr[i];
            arr[i] = arr[index];
            arr[index] = arr[a];
        }
        return arr;
    }
}
