package Extra;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    static List<Integer> pList;

    public int fact(int i){
        if(i==0)
            return 1;

        return i * fact(i-1);
    }


    public void printPascal(int n){

        pList=new ArrayList<>();
        int temp=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }

            for(int k=0; k<=i; k++){
                temp=fact(i)/(fact(i-k)* fact(k));
//                System.out.print(fact(i)/(fact(i-k)* fact(k))+" ");
                pList.add(temp);
            }
            System.out.println();
        }
    }

    public List<Integer> getList(){
        return pList;
    }
    static int N=3,M=3;
    public void printMatrix(int[][] mat,int i,int j) {
        if (i == N - 1 && j == M - 1) {
            System.out.println(mat[i][j]+" ");
            return;
        }
        System.out.print(mat[i][j]+ " ");
        if (j < M - 1) {
            printMatrix(mat, i, j + 1);
        }
        else if (i < N - 1) {
            printMatrix(mat, i + 1, 0);
        }
        System.out.println();
    }
}
