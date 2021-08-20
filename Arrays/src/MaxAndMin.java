import java.util.Scanner;
import java.lang.*;

class Pair{
    int max;
    int min;
    Pair(int max, int min){
        this.max = max;
        this.min = min;
    }
}

public class MaxAndMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        Pair p = maxAndMin(arr);
        System.out.println(p.max+" "+p.min);
    }

    static Pair maxAndMin(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }

        Pair p = new Pair(max, min);
        return p;
    }
}