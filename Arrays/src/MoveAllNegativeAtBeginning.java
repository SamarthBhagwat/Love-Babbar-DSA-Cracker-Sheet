import java.util.Scanner;

public class MoveAllNegativeAtBeginning {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i] = sc.nextInt();

        moveAllNegativeAtBeginning(arr);

        for(int i=0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void moveAllNegativeAtBeginning(int arr[]){
        /*
        Note - Here order is not important.

        Method 1 - Sorting .
                    Time Complexity - O(nlogn)
                    Space Complexity - O(1)

        Method 2 - Use 2 pointer or something like pivot function of quicksort
                    Time Complexity - O(n)
                    Space Complexity - O(1)
         */

        int low = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;
                low++;
            }
        }
    }
}
