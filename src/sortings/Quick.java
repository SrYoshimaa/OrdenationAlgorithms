package sortings;

import comparisons.Comparables;

public class Quick<T> implements Sort<T>{

    private T[] array;
    private Comparables<T> comparables;

    public long sort(T[] array, Comparables<T> comparables) {
        long start = System.currentTimeMillis();
        this.array = array;
        this.comparables = comparables;
        quick(0, this.array.length - 1);
        return System.currentTimeMillis() - start;
    }
    public void quick(int p, int r) {
        if (p < r) {
            int q = partition(p, r);
            quick(p, q - 1);
            quick(q + 1, r);
        }
    }
    private int partition(int p, int r) {
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
}
