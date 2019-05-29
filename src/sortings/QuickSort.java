package sortings;

import comparisons.Comparables;


public class QuickSort<T> implements Sort <T>{

    @Override
    public long sort(T array[], Comparables<T> comparables) {

		long start = System.currentTimeMillis();
        quickSort(array, 0, array.length, comparables);

        //new QuickSort();


        return System.currentTimeMillis() - start;
    }
    public void quickSort(T array[], int p, int r, Comparables<T> comparables){
        long q;
        if(p < r){
            q = Particao(array,p,r, comparables);
            quickSort(array, p, (int) (q-1), comparables);
            quickSort(array, (int) (q+1),r,comparables);
        }

    }

    public long Particao(T[] array, int p, int r, Comparables<T> comparables){

       T x = array[r];
       int i = p -1;
       T aux;

       for(int j = p; j <= r - 1; j++){
           if(comparables.compare(array[j], x) <= 0){
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

/*public class QuickSort<T> {

    private T[] objeto;
    private Compare<T> compare;

    public QuickSort(T[] objeto, Compare<T> compare) {
        this.objeto = objeto;
        this.compare = compare;
    }

    public void sort(int p, int r) {
        if (p < r) {
            int q = particao(p, r);
            sort(p, q-1);
            sort(q+1, r);
        }
    }

    private int particao(int p, int r) {
        T x = this.objeto[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (compare.compareTo(this.objeto[j], x) <= 0) {
                i = i + 1;
                T temp = this.objeto[i];
                this.objeto[i] = this.objeto[j];
                this.objeto[j] = temp;
            }
        }
        T temp = this.objeto[i + 1];
        this.objeto[i + 1] = this.objeto[r];
        this.objeto[r] = temp;
        return i + 1;
    }

    public void imprimir() {
        System.out.print("Quick Sort: [ ");
        sort(0, this.objeto.length - 1);
        for (int i = 0; i < this.objeto.length; i++) {
            System.out.print(i > 0 ? ", " : "");
            System.out.print(this.objeto[i]);
        }
        System.out.println(" ]");
    }

}*/