public class BubbleSort {

    public void bubbleSort(int[] x){

        for(int i=0; i<x.length-1; i++){

            int c=0;
            for(int j=0; j<x.length-1-i; j++){

                if(x[j+1]<x[j]){

                    int value = x[j+1];
                    x[j+1]=x[j];
                    x[j]=value;
                    c++;
                }
            }
            if(c==0){
                break;
            }
        }
    }
}
