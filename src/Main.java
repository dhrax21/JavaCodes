import DynamicProgramming.Fibonacci;
import Parenthesis.BalanceParenthesis;
import Parenthesis.GenerateParenthesis;
import Parenthesis.RemoveOuterParenthesis;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Fibonacci fb=new Fibonacci();

        System.out.println(fb.fib(30,new int[100]));




//
//        GenerateParenthesis g=new GenerateParenthesis();
//
//        ArrayList<String> sol = g.generate(3);
//        System.out.println(sol);

//        RemoveOuterParenthesis r=new RemoveOuterParenthesis();
//        System.out.println(r.removeParenthesis("((()))"));



//        QuickSort q=new QuickSort();
//
//        int[] arr={4,1,3,6,0,9};
//        System.out.println("Before Sorting \n"+ Arrays.toString(arr));
//
//        q.sort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
////
//        MergeSort m=new MergeSort();
//        int[] sol=m.Msort(arr);

//        InsertionSort s=new InsertionSort();
//        int[] sol=s.insertionSort(arr);

//        Arrays.sort(arr);
//        System.out.println("After Sorting \n"+ Arrays.toString(sol));

//        BalanceParenthesis b=new BalanceParenthesis();
//        boolean ans=b.isBal("()[]{}");
//        System.out.println(ans);
    }
}