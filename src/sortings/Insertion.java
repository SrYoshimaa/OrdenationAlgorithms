package sortings;

import comparisons.Comparables;

public class Insertion <T> implements Sort <T> {

    public long sort(T array[], Comparables<T> comparables){

        long start = System.currentTimeMillis();

        int i, j ;
        T key;
        for(i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            while(j >= 0 && comparables.compare(key,array[j]) < 0){
                array[j+1] = array[j];
                j -= 1;
            }
            array[j + 1] = key;
        }

        for(i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        return System.currentTimeMillis() - start;
    }
}
