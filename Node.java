/*
* Node.java
*/

public class Node implements Comparable<Node> {
    private double f;    // heuristic
    private double cost; // the path cost of getting here
    private Node parent; // node i was at before here
    private State st;    // current state im in
    private Action act;  // action i took to get here

    public Node() {
        parent = null;
        f = 0.0;
        cost = 0.0;
        st = null;
        act = null;
    }

    public Node(State state) {
        parent = null;
        f = 0.0;
        cost = 0.0;
        st = state;
        act = null;
    }

    public Node(State st, Node p, Action act, double f, double cost) {
        parent = p;
        this.st = st;
        this.act = act;
        this.f = f;
        this.cost = cost; 
    }

    @Override
    public int compareTo(Node o) {
        return Double.compare(f, o.getF());
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        //s.append("state: " + st.toString() + " "
                //+ "Path-Cost: " + f);
        s.append(f);

        return s.toString();
    }

    public Action getAction() {
        return act;
    }

    public State getState() {
        return st;
    }

    public Node getParent() {
        return parent;
    }

    public double getCost() {
        return cost;
    }

    public double getF() {
        return f;
    }
} // Node class
