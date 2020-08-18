public class U1 extends Rocket {


    U1() {
        name = "U1";
        cost = 100000000; //$
        weight = 10000; // kg = 10T
        maxWeight = 18000; // kg = 18T
        chanceOfLaunchExplosion = 5;
        chanceOfLandingCrash = 1;
        cargoLimit = maxWeight - weight;
    }
}
/*
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
        return result;    }

}
*/