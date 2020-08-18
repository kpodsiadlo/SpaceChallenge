import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public long runSimulation(ArrayList<Rocket> rockets) {
        long budget = 0;
        for (int i = 0; i< rockets.size(); i++) {
            long cost = rockets.get(i).cost;
            budget += cost;
            if (! ((rockets.get(i)).launch() && rockets.get(i).land())) {
                System.out.println("Crash" + rockets.get(i).name);
                i -= 1;
            }
        }
        return budget;
    }

    public ArrayList<Item> loadItems(String filename) {
        ArrayList<Item>  listOfItems = new ArrayList<>();
        File file = new File(filename);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int equalSignPosition = line.indexOf('=');
            Item item = new Item();
            item.name = line.substring(0, equalSignPosition);
            item.weight = Integer.parseInt(line.substring(equalSignPosition+1));
            listOfItems.add(item);
        }
        return listOfItems;
    }


    public ArrayList<U1> loadU1 (ArrayList<Item> listOfItems) {
        ArrayList<U1> listOfU1s = new ArrayList();
        U1 u1 = new U1();
        for (Item item : listOfItems) {
            if (u1.canCarry(item)) {
                u1.carry(item);
            } else {
                listOfU1s.add(u1);
                System.out.println("New Rocket U1");
                u1 = new U1();
                u1.carry(item);

            }
        }
        return listOfU1s;
    }

    public ArrayList<U2> loadU2 (ArrayList<Item> listOfItems) {
        ArrayList<U2> listOfU2s = new ArrayList();
        U2 u2 = new U2();
        for (Item item : listOfItems) {
            if (u2.canCarry(item)) {
                u2.carry(item);
            } else {
                listOfU2s.add(u2);
                System.out.println("New Rocket U2");
                u2 = new U2();
                u2.carry(item);
            }
        }
        return listOfU2s;
    }
}
