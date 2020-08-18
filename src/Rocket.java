public class Rocket implements SpaceShip {

    int cost;
    int weight;
    int maxWeight;
    int cargoLimit;
    int cargoCarried = 0;
    int chanceOfLaunchExplosion;
    int chanceOfLandingCrash;
    String name;
/*
    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

 */

    public boolean canCarry(Item item) {
        return (cargoCarried + item.weight) <= cargoLimit;
    }

    public void carry(Item item) {
        System.out.println(item.name + " loaded.");
        cargoCarried += item.weight;
    }


    @Override
    public boolean launch() {
        float launchFailureRate = (chanceOfLaunchExplosion * cargoCarried / (float) cargoLimit);
        float random = (float) (Math.random() * 100);
        boolean result = random > launchFailureRate;
        return result;
    }

    @Override
    public boolean land() {
        float landFailureRate = (chanceOfLandingCrash * cargoCarried / (float) cargoLimit);
        float random = (float) (Math.random() * 100);
        boolean result = random > landFailureRate;
        return result;
    }
}
