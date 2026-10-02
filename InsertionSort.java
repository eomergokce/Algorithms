public class InsertionSort {

    public void insertionSort(int[] x){

        for(int i=1; i<x.length; i++){

            int value = x[i];
            int j;
            for(j=i-1; j>=0; j--){

                if(x[j]>value){
                    x[j+1]=x[j];
                }
                else{
                    break;
                }
            }

            x[j+1]=value;
        }
    }
}
