import java.util.PriorityQueue;
import java.util.Scanner;

public class KthMaxElement {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(kthMaxElement(arr, k));
    }

    static int kthMaxElement(int arr[] , int k){
        /*
            Method 1 - Naive Approach - Sort the array and return element at index (n-k)
                                Time Complexity - O(nlogn)
                                Space Complexity - O(1)

            Method 2 - Use Heap Data structure.
            Note - For finding kth smallest element , use Max Heap and for finding kth largest element use
                    Min Heap.
                                Time Complexity - O(nlogk)
                                Space Complexity - O(k)

            Algo:
            1. Create a Min Heap.
            2. Now, traverse the array and keep on adding the item in Min Heap.
                3. If size of Min Heap become more than k , then pop an element.
            4. At last, return the element at the top/peek of Min Heap.
         */

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0 ; i<arr.length ; i++){
            pq.add(arr[i]);
            if(pq.size()>k)
                pq.poll();
        }

        return pq.peek();
    }
}
