package comparisons.text;

import comparisons.Comparables;

public class TextASComparables implements Comparables<String> {

    @Override
    public int compare(String a, String b) {

        return a.compareTo(b);

    }
}
