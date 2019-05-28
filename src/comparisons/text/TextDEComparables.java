package comparisons.text;

import comparisons.Comparables;

public class TextDEComparables implements Comparables<String> {


    @Override
    public int compare(String a, String b) {

        return b.compareTo(a);

    }
}
