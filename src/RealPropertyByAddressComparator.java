import java.util.Comparator;

public class RealPropertyByAddressComparator implements Comparator<RealProperty> {

    @Override
    public int compare(RealProperty o1, RealProperty o2) {
            return o1.getProperty().compareTo(o2.getProperty());
    }
}
