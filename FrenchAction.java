public class FrenchAction extends Action {
    private String name;
    private int distance;

    public FrenchAction() {
        name = "";
        distance = 0;
    }

    public FrenchAction(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getActionName() {
        return name;
    }

    public String getDestName() {
        return name.substring(3);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new FrenchAction(name, distance);
    }

    @Override
    public int compareTo(Action a) {
        return name.compareTo(((FrenchAction) a).name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (this == o)
            return true; // are they the same obj?
        if (!(o instanceof FrenchAction))
            return false; // are they same class?
        return compareTo((Action) o) == 0;
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