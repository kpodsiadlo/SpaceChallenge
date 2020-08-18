import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Simulation simulation = new Simulation();
        ArrayList<Item> phase1Items = simulation.loadItems("phase-1.txt");
        ArrayList<Item> phase2Items = simulation.loadItems("phase-2.txt");
        ArrayList<U1> listOfU1sPhase1 = simulation.loadU1(phase1Items);
        ArrayList<U1> listOfU1sPhase2 = simulation.loadU1(phase2Items);
        ArrayList<U2> listOfU2sPhase1 = simulation.loadU2(phase1Items);
        ArrayList<U2> listOfU2sPhase2 = simulation.loadU2(phase2Items);
        ArrayList<Rocket> fleetOfU1s = new ArrayList<>();
        ArrayList<Rocket> fleetOfU2s = new ArrayList<>();
        fleetOfU1s.addAll(listOfU1sPhase1);
        fleetOfU1s.addAll(listOfU1sPhase2);
        fleetOfU2s.addAll(listOfU2sPhase1);
        fleetOfU2s.addAll(listOfU2sPhase2);
        long costOfU1s = simulation.runSimulation(fleetOfU1s);
        long costOfU2s = simulation.runSimulation(fleetOfU2s);
        System.out.println("Cost of U1s: " + costOfU1s + ".");
        System.out.println("Cost of U2s: " + costOfU2s + ".");


    }

}
