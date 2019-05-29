package sortings;

import comparisons.Comparables;


public class QuickSort<T> implements Sort <T>{

    @Override
    public long sort(T array[], Comparables<T> comparables) {

		long start = System.currentTimeMillis();





        return System.currentTimeMillis() - start;
    }
    public void quickSort(T array[], int p, int r){
        if(p < r){
//            q = Particao(T array[], int p, int r);
        }



    }

    public long Particao(T array[], int p, int r, Comparables<T> comparables ){

       T x = array[r];
       int i = p -1;
       T aux;

       for(int j = p; j <= r - 1; j++){
           if(comparables.compare(array[j], x) >= 0){
               i = i + 1;
               aux = array[i];
               array[i] = array [j];
               array[j] = aux;
           }
            aux = array[i + 1];
           array[i + 1] = array[r];
           array[r] = aux;
       }
       return i+1;
    }
}