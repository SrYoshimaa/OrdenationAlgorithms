package comparisons;

public class NumberASCNumberComparable implements NumberComparable<Double> {

    @Override
    public Double compare(Double a, Double b) {
        return a - b;
    }
}
