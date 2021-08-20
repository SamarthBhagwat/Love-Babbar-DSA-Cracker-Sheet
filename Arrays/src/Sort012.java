import java.util.Scanner;

public class Sort012 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        sort012(arr);

        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void sort012(int arr[]){
        /*
            Method 1 : Sort using Arrays.sort
                    Time Complexity - O(nlogn)
                    Space Complexity - O(1)

            Method 2 : Use 3 pointer manipulation
            Algo:
            1.  Make 3 variables. The first variable(low) will store the index where the next 0 is gonna come.
                The second variable(mid) will work as an iterator and store the last index of 1.
                The third variable(high) will store the index where 2 need to come.
                    low = 0; mid = 0 and high = n-1;
            2. Run a loop till mid<=high. Equal because , there can be 0 at index h.
               which would not be handled if mid<high.
                3. For each element there are 3 possibilities
                Case 1: If it is '0', then swap arr[mid] and arr[low] and low++ and mid++. We are able to do
                        mid++ as we are sure that the swapped element would be 1 only.
                Case 2: If it is '1', then just mid++
                Case 3: If it is '2', then swap arr[mid] and arr[high] and high-- but no mid++ as the swapped
                        element can be 2 also.

                        Time Complexity - O(n)
                        Space Complexity - O(1)
         */

        int low = 0 , mid = 0 , high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1)
                mid++;
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
