package comparisons.numbers;

import comparisons.Comparables;

public class NumberASComparables implements Comparables<Double> {

    @Override
    public Double compare(Double a, Double b) {
        return a - b;
    }
}
