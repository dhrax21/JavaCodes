package Sorting;

import java.util.Arrays;

public class MergeSort {


    public int[] Msort(int[] arr){

        if(arr.length==1){
            return arr;
        }

        int mid=arr.length/2;

        int[] left=Msort(Arrays.copyOfRange(arr,0,mid));
        int[] right=Msort(Arrays.copyOfRange(arr,mid,arr.length));


        return merged(left,right);
    }

    private int[] merged(int[] left, int[] right) {
        int[] ans=new int[left.length + right.length];

        int i=0,j=0,k=0;
        while(i<left.length && j< right.length){

            if(left[i]<right[j]){
                ans[k++]=left[i++];
            }else {
                ans[k++] = right[j++];
            }
        }

        while(i< left.length){
            ans[k++]=left[i++];
        }
        while(j< right.length){
            ans[k++]=right[j++];
        }
        return ans;
    }
}
