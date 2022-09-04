import java.util.Hashtable;
import java.util.PriorityQueue;

public class Search {

    public Hashtable<State, Node> reached;
    public PriorityQueue<Node> frontier;
    private int maintained = 0;
    private int explored = 0;
    private int expanded = 0;

    public Search() {
        reached = new Hashtable<State, Node>();
        frontier = new PriorityQueue<Node>();
    }

    public Solution ucs(Problem p) {
        reached = new Hashtable<State, Node>();
        frontier = new PriorityQueue<Node>();
        maintained = 0;
        explored = 0;
        expanded = 0;

        Node n = new Node(p.getInitialState()); // the initial (S) node
        frontier.add(n);
        maintained += 1;
        reached.put(n.getState(), n);
        while (!frontier.isEmpty()) {
            n = frontier.remove();
            explored += 1;

            if (p.goalTest(n.getState())) {
                return new Solution(n, explored, expanded, maintained);
            }

            for (Action a : p.getActions(n.getState())) {
                expanded += 1;
                State st = p.getResult(n.getState(), a);

                double cost = n.getCost() + p.getStepCost(n.getState(), a);
                double f = cost; // F(n) = G(n) for UCS
                if ( !reached.containsKey(st) || f < reached.get(st).getF()) {
                    Node c = new Node(st, n, a, f, cost); // create a child node
                    reached.put(st, c);
                    frontier.add(c);
                    maintained += 1;
                }
            }
        }
        // return FAIL
        return new Solution();
    }

    public Solution gbfs(Problem p) {
        reached = new Hashtable<State, Node>();
        frontier = new PriorityQueue<Node>();
        maintained = 0;
        explored = 0;
        expanded = 0;

        Node n = new Node(p.getInitialState()); // the initial (S) node
        frontier.add(n);
        maintained += 1;
        reached.put(n.getState(), n);
        while (!frontier.isEmpty()) {
            n = frontier.remove();
            explored += 1;

            if (p.goalTest(n.getState())) {
                return new Solution(n, explored, expanded, maintained);
            }

            for (Action a : p.getActions(n.getState())) {
                expanded += 1;
                State st = p.getResult(n.getState(), a);

                double cost = n.getCost() + p.getStepCost(n.getState(), a);
                double f = p.h(n.getState()); // F(n) = H(n) for GBFS
                if ( !reached.containsKey(st) || f < reached.get(st).getF()) {
                    Node c = new Node(st, n, a, f, cost); // create a child node
                    reached.put(st, c);
                    frontier.add(c);
                    maintained += 1;
                }
            }
        }
        // return FAIL
        return new Solution();
    }

    public Solution astar(Problem p) {
        reached = new Hashtable<State, Node>();
        frontier = new PriorityQueue<Node>();
        maintained = 0;
        explored = 0;
        expanded = 0;

        Node n = new Node(p.getInitialState()); // the initial (S) node
        frontier.add(n);
        maintained += 1;
        reached.put(n.getState(), n);
        while (!frontier.isEmpty()) {
            n = frontier.remove();
            explored += 1;

            if (p.goalTest(n.getState())) {
                return new Solution(n, explored, expanded, maintained);
            }

            for (Action a : p.getActions(n.getState())) {
                expanded += 1;
                State st = p.getResult(n.getState(), a);

                double cost = n.getCost() + p.getStepCost(n.getState(), a);
                double f = n.getCost() + p.h(n.getState()); // F(n) = G(n) + H(n) for A*
                if ( !reached.containsKey(st) || f < reached.get(st).getF()) {
                    Node c = new Node(st, n, a, f, cost); // create a child node
                    reached.put(st, c);
                    frontier.add(c);
                    maintained += 1;
                }
            }
        }
        // return FAIL
        return new Solution();
    }
}