package comparisons;

public class NumberDECNumberComparable implements NumberComparable<Double> {

    @Override
    public Double compare(Double a, Double b) {
        return b - a;
    }
}
