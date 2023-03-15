/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Merge_Sort;

/**
 *
 * @author cong0
 */
public class Main {

    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void mergesort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n-1; ++i) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[n-1]+"]");
    }
    public static void main(String args[]) {
        int arr[] = {38,27,43,3,9,82,10};
        System.out.print("Given Array : ");
        printArray(arr);
        mergesort(arr, 0, arr.length - 1);
        System.out.print("Sorted array : ");
        printArray(arr);
    }
}
