public class Rocket implements SpaceShip {

    int cost;
    int weight;
    int maxWeight;
    int cargoLimit;
    int cargoCarried = 0;
    String name;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return (cargoCarried + item.weight) <= cargoLimit;
    }

    public void carry(Item item) {
        System.out.println(item.name + " loaded.");
        cargoCarried += item.weight;
    }
}
