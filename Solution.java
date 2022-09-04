import java.util.LinkedList;

/*
 * Solution.java
 */

public class Solution {

  private double cost;
  private LinkedList<Node> sol;
  private int explored = 0;
  private int expanded = 0;
  private int maintained = 0;

  public Solution() {
    //cost = 0.0;
    //sol = new LinkedList<Node>();
    // only called when search fails
  }

  public Solution(Node node, int explored, int expanded, int maintained) {
    sol = new LinkedList<Node>();
    cost = node.getCost();
    while (node.getParent() != null) {
      sol.addFirst(node);
      node = node.getParent();
    }

    this.explored = explored;
    this.expanded = expanded;
    this.maintained = maintained;
  }

  public double getCost() {
    return cost;
  }

  public int size() {
    return sol.size();
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append(getCost() + " ");
    for (Node n : sol) {
      s.append(n.getAction().toString() + " ");
    }
    s.append(explored + " " + expanded + " " + maintained);
    return s.toString();
  }
} // Solution class
