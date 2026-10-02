public class SelectionSort {

    public void selectionSort(int[] x){

        for(int i=0; i<x.length-1; i++){

            int value = x[i];
            int index = i;

            for(int j=i+1; j<x.length; j++){

                if(x[j]<x[index]){

                    index=j;
                }
            }

            x[i]=x[index];
            x[index]=value;
        }

    }
}
