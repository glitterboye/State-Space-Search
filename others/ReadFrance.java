// /*
// * ReadFrance.java
// * Copyright (c) 2019 Mark Maloof. All Rights Reserved. See LICENSE.
// */

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// public class ReadFrance {

// public ReadFrance() throws FileNotFoundException {
// File file = new File("input/triangle.txt");
// // File file = new File("input/france.txt");
// Scanner sc = new Scanner(file);
// while (sc.hasNextLine()) {
// String line = sc.nextLine().trim();
// String[] tokens = line.split(" +");
// System.out.println("city: " + tokens[0]);
// System.out.print("lat-long:");
// for (int i = 1; i <= 8; i++)
// if (i == 4 || i == 8)
// System.out.print(" " + tokens[i]); // hemisphere
// else
// System.out.print(" " + Integer.parseInt(tokens[i]));
// System.out.print("\naction-cost pairs:");
// for (int i = 10; i < tokens.length; i += 2)
// System.out.printf(" [%s, %d]",
// tokens[i], Integer.parseInt(tokens[i + 1]));
// System.out.println("\n=-=--=-=");
// } // while
// sc.close();
// } // ReadFrance

// public static void main(String[] args) {
// try {
// ReadFrance france = new ReadFrance();
// } // try
// catch (Exception e) {
// System.out.println(e.getMessage());
// e.printStackTrace();
// } // catch
// } // main
// } // ReadFrance class
