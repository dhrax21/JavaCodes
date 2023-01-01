package Sorting;
public class QuickSort {

    public void sort(int[] arr, int low, int hi) {
        int pivot=partition(arr,low,hi);

        if(low<pivot-1){
            sort(arr,low,pivot-1);
        }
        if(pivot<hi){
            sort(arr,pivot,hi);
        }
    }

    public int partition(int[] arr,int low,int hi)
    {
            int pivot=arr[low];

            while(low<hi){
                while(arr[low]<pivot){
                    low++;
                }
                while(arr[hi]>pivot){
                    hi--;
                }
                if(low<=hi){
                    Swap(arr,low,hi);
                    low++;
                    hi--;
                }
            }
            return low;
    }

    private void Swap(int[] arr, int low, int hi) {
        int temp=arr[low];
        arr[low]=arr[hi];
        arr[hi]=temp;
    }
}
