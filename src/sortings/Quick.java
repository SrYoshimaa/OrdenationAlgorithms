package sortings;

import comparisons.Comparables;

public class Quick<T> {

    private T[] array;
    private Comparables<T> comparables;

    public Quick(T[] array, Comparables<T> comparables) {
        this.array = array;
        this.comparables = comparables;
    }

    public void sort(int p, int r) {
        if (p < r) {
            int q = particao(p, r);
            sort(p, q - 1);
            sort(q + 1, r);
        }
    }

    private int particao(int p, int r) {
        T x = this.array[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (comparables.compare(this.array[j], x) <= 0) {
                i = i + 1;
                T temp = this.array[i];
                this.array[i] = this.array[j];
                this.array[j] = temp;
            }
        }
        T temp = this.array[i + 1];
        this.array[i + 1] = this.array[r];
        this.array[r] = temp;
        return i + 1;
    }
    public void print(boolean show){
        long d1 = System.currentTimeMillis();
        System.out.println("Quick Sort:");
        sort(0, this.array.length - 1);
        if (show) {
            for (int i = 0; i < this.array.length; i++){
                System.out.println(this.array[i]);
            }
        }
        System.out.println("Time: "+ ((System.currentTimeMillis() - d1)/1000.0000) + " Seconds.");
    }
}
