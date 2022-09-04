import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class France extends Problem {

    private Hashtable<State, ArrayList<Action>> graph;
    private Hashtable<String, State> states;

    public France() {
        graph = new Hashtable<State, ArrayList<Action>>();
        states = new Hashtable<String, State>();
        initial = new FrenchCity();
        goal = new FrenchCity();

        try {
            readGraph("france.txt");
        } // try
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void readGraph(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            ArrayList<Action> actions = new ArrayList<Action>();

            String line = sc.nextLine().trim();
            ArrayList<String> tokens = new ArrayList<String>(Arrays.asList(line.split(" +")));

            for (int i = 10; i < tokens.size(); i += 2) {
                int dis = Integer.parseInt(tokens.get(i + 1));
                Action action = new FrenchAction(tokens.get(i), dis); // create new action
                actions.add(action); // put into array
            }
            String nm = tokens.get(0);
            ArrayList<String> latlong = new ArrayList<String>(tokens.subList(1, 9));
            // new latlong obj & pass object into french city
            State s = new FrenchCity(nm, latlong);
            graph.put(s, actions);
            states.put(nm, s);
        } // while
        sc.close();
    }

    // great circle distance w/ haversin formula
    public double gcd(State start, State end) {
        LatLong s = ((FrenchCity) start).getLL();
        LatLong e = ((FrenchCity) end).getLL();

        double earthR = 6371; // * Math.pow(10, 3) uncomment for meters
        double latA = s.getLat() * Math.PI / 180; // convert all to RAD
        double latB = e.getLat() * Math.PI / 180;
        double lngA = s.getLong() * Math.PI / 180;
        double lngB = e.getLong() * Math.PI / 180;
        double delLat = (latB - latA); // Deltas
        double delLng = (lngB - lngA);

        // haversine = sin^2(delLat/2) + cos(latA)cos(latB) * sin^2(delLng/2)
        double haver = Math.pow(Math.sin(delLat / 2), 2) +
                Math.cos(latA) * Math.cos(latB) *
                        Math.pow(Math.sin(delLng / 2), 2);

        // gcd is 2 * earth's Radius * invSin(sqrt(haversine result))
        return 2 * Math.asin(Math.sqrt(haver)) * earthR;
    }

    public State getGoalState() {
        return goal;
    }

    @Override
    public ArrayList<Action> getActions(State state) {
        FrenchCity f = (FrenchCity) state;
        return graph.get(f);
    }

    @Override
    public State getInitialState() {
        return initial;
    }

    @Override
    public State getResult(State state, Action action) {
        String nm = ((FrenchAction) action).getDestName();

        return states.get(nm);
    }

    @Override
    public double getStepCost(State state, Action action) {
        return ((FrenchAction) action).getDistance();
    }

    @Override
    public boolean goalTest(State state) {
        return goal.equals(state);
    }

    @Override
    public double h(State state) {
        return gcd(state, goal);
    }

    @Override
    public void setInitialStateByName(String s) {
        initial = states.get(s);
    }

    @Override
    public void setGoalStateByName(String s) {
        goal = states.get(s);
    }
}
