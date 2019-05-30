package sortings;

import comparisons.Comparables;

public class Quick<T> {

    private T[] objeto;
    private Comparables<T> comparables;

    public Quick(T[] objeto, Comparables<T> comparables) {
        this.objeto = objeto;
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
        T x = this.objeto[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (comparables.compare(this.objeto[j], x) <= 0) {
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
}
