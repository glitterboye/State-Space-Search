import java.util.ArrayList;

public class FrenchCity extends State {
    String name;
    private LatLong ll;

    public FrenchCity() {
        name = "";
        ll = new LatLong();
    }

    public FrenchCity(String n, ArrayList<String> ll) {
        setName(n);
        this.ll = new LatLong(ll);
    }

    public FrenchCity(String n, LatLong ll) {
        setName(n);
        this.ll = ll;
    }

    public String getName() {
        return name;
    }

    public String getNameFormatted() {
        return name.substring(3);
    }

    public void setName(String n) {
        name = n;
    }

    public LatLong getLL() {
        return ll;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new FrenchCity(name, ll);
    }

    @Override
    public int compareTo(State s) {
        return name.compareTo(((FrenchCity) s).name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (this == o)
            return true; // are they the same obj?
        if (!(o instanceof FrenchCity))
            return false; // are they same class?
        return compareTo((State) o) == 0;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(name);
        return s.toString();
    }
}
