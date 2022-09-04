# State-Space Search Project

This is a project written in **Java 11** that compares three common state-space search algorithms used in Artificial Intelligence. The three algorithms in question are:
- A* ("AStar")
- Uniform Cost Search (UCS)
- Greedy Best First Search

The structure of the files allows this program to be applied to any abstract search problem. For searching through France, classes are derived and implemented from abstract template classes.

...E.g. `Action.java` -> `FrenchAction.java`

The Problem is derived given a weighted, directed graph stored in `france.txt`
What the graph looks like:

<img src="images/france.gif" />

The program is also given a list of French cities' lattitude and longitudes. This allows some search algorithms to estimate the chord distance between two coordinated using the [Haversine Formula](https://en.wikipedia.org/wiki/Haversine_formula)

In addition to keeping track of a solution and cost to reach the goal city, the program also keeps track of:
- number of nodes explored, entered, and visited
- number of nodes expanded
- number of nodes maintained (stored in a Frontier of some sort)
