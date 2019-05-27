package comparisons.numbers;

import comparisons.Comparables;

public class NumberDEComparables implements Comparables<Double> {

    @Override
    public Double compare(Double a, Double b) {
        return b - a;
    }
}
