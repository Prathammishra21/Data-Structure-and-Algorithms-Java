package Searching_Algorithms;

public class fibonacci_search {
    static int min(int a, int b) {
        return (a > b) ? b : a;
    }

    static int fibonacci_search(int[] arr, int n, int key) {
        int offset = -1;
        int fm2 = 0;
        int fm1 = 1;
        int fm = fm1 + fm2;
        while (fm < n) {
            fm2 = fm1;
            fm1 = fm;
            fm = fm1 + fm2;
        }
        while (fm > 1) {
            int i = min(offset + fm2, n - 1);
            if (arr[i] < key) {
                fm = fm1;
                fm1 = fm2;
                fm2 = fm - fm1;
                offset = i;
            } else if (arr[i] > key) {
                fm = fm2;
                fm1 = fm1 - fm2;
                fm2 = fm - fm1;
            } else
                return i;
        }
        if (fm1 == 1 && arr[offset + 1] == key)
            return offset + 1;
        return -1;
    }

    public static void main(String[] args) {
        int i,n,key;
        int arr[] = {12,32,5642,624,43,53,67,983,33,44};
        System.out.print("Array elements are: ");
        for (int j = 0; j< arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        n =10;
        key = 67;
        System.out.println("\nElements to be searched: "+key);
        int pos = fibonacci_search(arr,n,key);
        if(pos>=0)
            System.out.println("The element is found at index: "+pos);
        else
            System.out.println("\n Unsuccessful search");

    }
}
