public class MergeSort {

    public void mergeSort(int[] x, int left, int right){

        if(left>=right){
            return;
        }

        int mid = (left+right)/2;

        mergeSort(x, left, mid);
        mergeSort(x, mid+1, right);

        merge(x, left, mid, right);
    }

    public void merge(int[] x, int left, int mid, int right){

        int[] temp = new int[right-left+1];

        int k=0;
        int i=left;
        int j=mid+1;

        while(i<=mid && j<=right ){

            if(x[i]<=x[j]){
                temp[k]=x[i];
                i++;
            }
            else{
                temp[k]=x[j];
                j++;
            }

            k++;
        }

        while(i<=mid){
            temp[k] = x[i];
            i++;
            k++;
        }
        while(j<=right){
            temp[k] = x[j];
            j++;
            k++;
        }

        for(int n=0; n<temp.length; n++){
            x[left++] = temp[n];
        }

    }
}
