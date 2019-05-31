package comparisons.object;

import comparisons.Comparables;

public class ObjectDEComparables implements Comparables<Locations> {
    @Override
    public int compare(Locations a, Locations b) {
        if (a.getLatitude() > b.getLatitude()) {
            return -1;
        }
        if (a.getLatitude() == b.getLatitude()) {
            if (a.getLongitude() > b.getLongitude()) {
                return -1;
            }
            if (a.getLongitude() == b.getLongitude()) {
                return 0;
            }
        }
        return 1;
    }
}
