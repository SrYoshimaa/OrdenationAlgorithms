package sortings;

import comparisons.Comparables;

public interface Sort <T> {

    long sort(T array[], Comparables<T> comparables);
}
