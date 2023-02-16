import DynamicProgramming.UniquePaths;
import Extra.CountAndSay;
import Extra.LargestNumber;
import Extra.PascalTriangle;
import Sorting.QuickSort;
import immutableClass.Database;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        PascalTriangle p=new PascalTriangle();
        p.printMatrix(mat,0,0);
    }
}