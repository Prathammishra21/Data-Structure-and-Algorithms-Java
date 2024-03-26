package Searching_Algorithms;
public class Binary_Search {
    public static void binary_search(int []a, int low, int high, int key) {
        int mid = (low + high) / 2;
        if (low <= high) {
            if (a [mid] == key)
                System.out.println("Element found at index: " + mid);
            else if (key < a[mid])
                binary_search(a, low, mid - 1, key);
            else if (a[mid] < key)
                binary_search(a, mid + 1, high, key);
        } else {
            System.out.println("Unsuccessful search");
        }
    }

    public static void main(String[] args) {
        int n, key, low, high;
        n = 5;
        low = 0;
        high = n-1;
        int []a = {12,14,18,22,39};
        key = 22;
        binary_search(a,low,high,key);
        key = 30;
        binary_search(a, low, high, key);
    }
}

