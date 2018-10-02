public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++){
            int temp = a[i];
            int k = i -1;
            while (k >= 0 && a[k] > temp){
                a[k+1] = a[k];
                --k;
            }
            a[k + 1] = temp;
        }
    }
}
