package comparisons.number;

import comparisons.Comparables;

public class NumberASComparables implements Comparables<Double> {

    @Override
    public int compare(Double a, Double b) {

        if (a - b > 0){
            return (int)Math.ceil(a-b);
        }
        else {
            return (int)Math.floor(a-b);
        }

    }
}
