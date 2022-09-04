// package others;
// /*
// * Main.java
// * Copyright (c) 2019 Mark Maloof. All Rights Reserved. See LICENSE.
// */

// import java.io.*;

// import France;
// import Problem;
// import Search;
// import Solution;

// public class maina {

// public static void main(String[] args) {
// try {
// String initial = "grenoble";
// String goal = "paris";
// Search search = new Search(); // implement this generically.
// // should not refer to french action or french city.
// Problem problem = new France();
// problem.setInitialStateByName(initial);
// problem.setGoalStateByName(goal);
// Solution solution = search.ucs(problem);
// System.out.println("UCS from " + initial + " to " + goal);
// // See output
// // Format: cost, actions, explored, expanded, maintained
// // explore: pull out of frontier
// // expanded: how many ...
// // maintained: how many went into the frontier
// System.out.println(solution);
// System.out.println("Cost: " + solution.getCost());
// // UCS F = Cost. A* and GBFS F != Cost
// System.out.println("Number of actions: " + solution.size());
// } // try
// catch (Exception e) {
// System.out.println(e.getMessage());
// e.printStackTrace();
// } // catch
// } // main

// } // Main class
