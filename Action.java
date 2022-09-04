/*
 * Action.java
 */

public abstract class Action extends Object implements Comparable<Action> {
  public Action() { }
  abstract protected Object clone() throws CloneNotSupportedException;
  abstract public int compareTo( Action a );
  abstract public boolean equals( Object o );
  abstract public int hashCode();
  abstract public String toString();
} // Action class
