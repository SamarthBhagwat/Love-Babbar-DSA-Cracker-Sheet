import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int a[] = new int[m];
        for(int i=0 ; i<m ; i++){
            a[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int b[] = new int[n];
        for(int i=0 ; i<n ; i++){
            b[i] = sc.nextInt();
        }

        System.out.println(intersectionOfArrays(a, m , b , n));
    }

    static int intersectionOfArrays(int a[], int m , int b[] , int n){
        /*
            Method 1 - Naive Method. For every element of first array, look whether it
            is present in the second array or not.
                    Time Complexity - O(n*m)

            Example - {4, 4}
                      {4, 6 ,8 ,6 2, 7, 4 }
            Correct answer - 1 ie. 4
            We have to count distinct intersecting elements.


            Method 2 - Using Hashing. Use HashSet.
            Algo:
            1. Create a HashSet.
            2. Add elements of first array in Hashset.
            3. Now, traverse the second array , and for each element check
                whether the element is present in HashSet or not. If it is
                present then remove the element and increase the count and if
                it is not present then do nothing.

                       Time Complexity - O(n+m)
                       Space Complexity - O(m)
         */

        Set<Integer> set = new HashSet<>();
        for(int i=0 ; i<m ; i++){
            set.add(a[i]);
        }
        int count = 0;
        for(int i=0 ; i<n ; i++){
            if(set.contains(b[i])){
                set.remove(b[i]);
                count++;
            }
        }

        return count;
    }
}
