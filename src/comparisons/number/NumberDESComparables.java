package comparisons.number;

import comparisons.Comparables;

public class NumberDESComparables implements Comparables<Double> {

    @Override
    public int compare(Double a, Double b) {

        if (b - a > 0){
            return (int)Math.ceil(b-a);
        }
        else {
            return (int)Math.floor(b-a);
        }
    }
}
