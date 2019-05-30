package sortings;

import comparisons.Comparables;

public  class Merge <T> implements Sort<T> {

    public long sort(T array[], Comparables<T> comparables){

            merge(array,0, array.length - 1, comparables);
            for(int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        return 0;
    }


    public void merge(T array[], int p, int r,Comparables<T> comparables){
        int q;

        if (p < r){
            q = (p + r)/2;
            merge(array, p, q, comparables);
            merge(array, q+1, r, comparables);
            merge(array, p, q ,r, comparables );
        }

    }

    public void merge(T array[], int p,int q, int r, Comparables<T> comparables){
        int n1 = q - p + 1;
        int n2 = r - q;

        T L[] = (T[]) new Object[n1 + 1];
        T R[] = (T[]) new Object[n2 + 1];

        for(int i = 1; i <= n1; i++){
            L[i] = array[p+i - 1];
        }

        for (int j = 1; j <= n2; j++){
            R[j] = array[q+j];
        }

        int i = 1;
        int j = 1;

        for (int k = p; k <= r; k++){

            if ( i < L.length  && j < R.length) {

                if (comparables.compare(R[j], L[i]) > 0) {
                    array[k] = L[i];
                    i = i + 1;
                } else {
                    array[k] = R[j];
                    j = j + 1;
                }
            } else {
                if (i < L.length) {
                    array[k] = L[i];
                    i = i + 1;
                } else {
                    array[k] = R[j];
                    j = j + 1;
                }
            }
        }

    }

    }
