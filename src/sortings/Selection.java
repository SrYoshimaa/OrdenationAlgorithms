package sortings;

import comparisons.Comparables;

public class Selection<T> implements Sort<T> {

    public long sort(T array[], Comparables<T> comparables){

        long start = System.currentTimeMillis();
        int i, j;
        T aux;
        for(i = 0; i < array.length; i++) {
            int menor = i;
            for (j = i + 1; j < array.length; j++) {
                if (comparables.compare(array[menor], array[j]) > 0)
                    //if(array[j] < array[menor]){//
                    menor = j;
            }
            aux = array[i];
            array[i] = array[menor];
            array[menor] = aux;


        }
            for(i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
            System.out.println(System.currentTimeMillis() - start + " segundos");
        return System.currentTimeMillis() - start;
    }
}
