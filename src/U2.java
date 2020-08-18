public class U2 extends Rocket {

    int chanceOfLaunchExplosion;
    int chanceOfLandingCrash;


    U2() {
        name = "U2";
        cost = 120000000; //$
        weight = 18000; // kg = 18T
        maxWeight = 29000; // kg = 29T
        chanceOfLaunchExplosion = 4;
        chanceOfLandingCrash = 8;
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