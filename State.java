/*
 * State.java
 */

public abstract class State extends Object implements Comparable<State> {
  public State() {
  }

  abstract protected Object clone() throws CloneNotSupportedException;

  abstract public int compareTo(State s);

  abstract public boolean equals(Object o);

  abstract public int hashCode();

  abstract public String toString();
} // State class
