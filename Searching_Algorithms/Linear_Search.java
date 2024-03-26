package Searching_Algorithms;

public class Linear_Search {
    public static void linear_search(int[] a, int n, int key) {
        int i, count = 0;
        for(i = 0; i <= n; i++) {
            if(a[i] == key) {
                System.out.println("The element is found at " + (i)+ " index");
                count = count + 1;
            }
        }
        if(count == 0) // for unsuccessful search
            System.out.println("The element is not present in the array");
    }
    public static void main(String[] args) {
        int  n, key;
        n = 6;
        int[] a = {12, 44, 32, 18, 4, 10, 66};
        key = 10;
        linear_search(a, n, key);
        key = 61;
        linear_search(a, n, key);
    }
}