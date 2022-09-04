import java.text.DecimalFormat;
import java.util.ArrayList;

public class LatLong {
    private double lat; // decimal degree form
    private double lng;

    public LatLong() {
        lat = 0.0;
        lng = 0.0;
    }

    public LatLong(ArrayList<String> l) {
        // [degree, minute, second, HEM1, degree, minute, second, HEM2]
        lat = 0.0;
        lng = 0.0;
        set(l);
    }

    public double getLat() {
        return lat;
    }

    public double getLong() {
        return lng;
    }

    public void set(ArrayList<String> l) {
        // Dec. = Deg + M/60 + S/3600
        lat += Double.parseDouble(l.get(0))
                + (Double.parseDouble(l.get(1))) / 60
                + (Double.parseDouble(l.get(2))) / 3_600;
        lng += Double.parseDouble(l.get(4))
                + (Double.parseDouble(l.get(5))) / 60
                + (Double.parseDouble(l.get(6))) / 3_600;

        DecimalFormat df = new DecimalFormat("##.####");
        lat = Double.parseDouble(df.format(lat));
        lng = Double.parseDouble(df.format(lng));

        if (l.get(3).equals("S"))
            lat *= -1;
        if (l.get(7).equals("W"))
            lng *= -1;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(String.valueOf(lat) + " " + String.valueOf(lng));
        return s.toString();
    }
}
