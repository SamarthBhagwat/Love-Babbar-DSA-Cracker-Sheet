import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionOfArrays {
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

        System.out.println(unionOfArrays(a, m , b , n));
    }

    static int unionOfArrays(int a[], int m , int b[], int n){
        /*
        Algo: Traverse both the arrays one after the other and add all the elements in the Hashset.
                Time Complexity - O(m+n)
                Space Complexity - O(m+n)
         */

        Set<Integer> set = new HashSet<>();
        for(int i=0 ; i<m ; i++){
            set.add(a[i]);
        }
        for(int i=0 ; i<n ; i++){
            set.add(b[i]);
        }

        return set.size();
    }
}
