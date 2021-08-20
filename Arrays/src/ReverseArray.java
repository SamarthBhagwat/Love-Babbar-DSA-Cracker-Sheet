import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);

        printArray(arr);
    }
    /*
        Algo :
            Use the concept of swapping. We will swap the first element with the last element of the array.
            Similarly, second element with second last element and so on.
                    Time Complexity - O(n)
                    Space Complexity - O(1)
     */
    static void reverseArray(int arr[]){
        int l = 0, r = arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }


}

