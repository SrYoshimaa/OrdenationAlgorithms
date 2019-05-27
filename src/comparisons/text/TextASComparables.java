package comparisons.text;

import comparisons.Comparables;

public class TextASComparables implements Comparables<String> {

    @Override
    public Double compare(String a, String b) {
        if (a.compareTo(b) < 0){
            return 1.0;
        }
        else{
            return -1.0;
        }
    }
}
