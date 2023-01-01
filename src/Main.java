import Sorting.MergeSort;
import Sorting.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        QuickSort q=new QuickSort();

        int[] arr={4,1,3,6,0,9};
        System.out.println("Before Sorting \n"+ Arrays.toString(arr));

//        q.sort(arr,0,arr.length-1);

        MergeSort m=new MergeSort();
        int[] sol=m.Msort(arr);

//        Arrays.sort(arr);
        System.out.println("After Sorting \n"+ Arrays.toString(sol));
    }
}