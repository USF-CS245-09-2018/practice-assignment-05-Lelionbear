public class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        quickSort(arr,0,arr.length-1);//initiate quickSort
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left >= right)//base case
            return;

        int pivot = arr[(left + right)/2];//pivot is the middle of the array
        int index = partition(arr,left,right,pivot);//send arr to be sorted into two halves
        quickSort(arr,left,index - 1);//repeat process with left side
        quickSort(arr,index ,right);//repeat process with right side
    }

    private int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right){
            while(arr[left] < pivot){
                left++;//move the index left side
            }
            while(arr[right] > pivot){
                right--;//move index for right side
            }

            if (left <= right){
                swap(arr,left,right);
                left++;//move index for left side
                right--;//move index for right side
            }
        }
        return left;//return index
    }

    private void swap(int[] arr, int a, int b) {//swap method 
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
