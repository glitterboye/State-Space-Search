// Main class for testing purposes

public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        Problem problem = new France();

        /* == RUN 1 == */
        String S = "brest";
        String G = "marseille";
        problem.setInitialStateByName(S);
        problem.setGoalStateByName(G);
        // 1. UCS
        Solution solution = search.ucs(problem);
        System.out.println("UCS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 2. GBFS
        solution = search.gbfs(problem);
        System.out.println("GBFS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 3. ASTAR
        solution = search.astar(problem);
        System.out.println("AStar from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size() + "\n");

        /* == RUN 2 == */
        S = "montpellier";
        G = "calais";
        problem.setInitialStateByName(S);
        problem.setGoalStateByName(G);
        // 1. UCS
        solution = search.ucs(problem);
        System.out.println("UCS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 2. GBFS
        solution = search.gbfs(problem);
        System.out.println("GBFS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 3. ASTAR
        solution = search.astar(problem);
        System.out.println("AStar from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size() + "\n");

        /* == RUN 3 == */
        S = "strasbourg";
        G = "bordeaux";
        problem.setInitialStateByName(S);
        problem.setGoalStateByName(G);
        // 1. UCS
        solution = search.ucs(problem);
        System.out.println("UCS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 2. GBFS
        solution = search.gbfs(problem);
        System.out.println("GBFS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 3. ASTAR
        solution = search.astar(problem);
        System.out.println("AStar from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size() + "\n");

        /* == RUN 4 == */
        S = "paris";
        G = "grenoble";
        problem.setInitialStateByName(S);
        problem.setGoalStateByName(G);
        // 1. UCS
        solution = search.ucs(problem);
        System.out.println("UCS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 2. GBFS
        solution = search.gbfs(problem);
        System.out.println("GBFS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 3. ASTAR
        solution = search.astar(problem);
        System.out.println("AStar from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size() + "\n");

        /* == RUN 5 == */
        S = "grenoble";
        G = "paris";
        problem.setInitialStateByName(S);
        problem.setGoalStateByName(G);
        // 1. UCS
        solution = search.ucs(problem);
        System.out.println("UCS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 2. GBFS
        solution = search.gbfs(problem);
        System.out.println("GBFS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 3. ASTAR
        solution = search.astar(problem);
        System.out.println("AStar from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size() + "\n");

        /* == RUN 6 == */
        S = "brest";
        G = "grenoble";
        problem.setInitialStateByName(S);
        problem.setGoalStateByName(G);
        // 1. UCS
        solution = search.ucs(problem);
        System.out.println("UCS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 2. GBFS
        solution = search.gbfs(problem);
        System.out.println("GBFS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 3. ASTAR
        solution = search.astar(problem);
        System.out.println("AStar from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size() + "\n");

        /* == RUN 7 == */
        S = "grenoble";
        G = "brest";
        problem.setInitialStateByName(S);
        problem.setGoalStateByName(G);
        // 1. UCS
        solution = search.ucs(problem);
        System.out.println("UCS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 2. GBFS
        solution = search.gbfs(problem);
        System.out.println("GBFS from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size());
        // 3. ASTAR
        solution = search.astar(problem);
        System.out.println("AStar from " + S + " to " + G);
        System.out.println(solution);
        System.out.println("Cost: " + solution.getCost() + "\tNumber of actions: " + solution.size() + "\n");
    }
}