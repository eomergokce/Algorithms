public class QuickSort {

    public void quickSort(int[] x, int left, int right){

        if (left >= right) {
            return;
        }

        int pivot = x[right];
        int j=left;

        for(int i=left; i<right; i++){

            if(x[i]<pivot){
                int k=x[j];
                x[j]=x[i];
                x[i]=k;
                j++;
            }
        }

        int temp=x[j];
        x[j]=pivot;
        x[right]=temp;

        quickSort(x, left, j-1);
        quickSort(x, j+1, right);

    }
}
