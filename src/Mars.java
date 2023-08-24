public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "My Colony";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;

        String landingLocation = "The Plain";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute < minutesLeft; minute++) {
            if ((minute % 2 == 0) && (minute % 3 == 0)) {
                System.out.println("Keep Center");
            } else if (minute % 3 == 0) {
                System.out.println("Left");
            } else if (minute % 2 == 0) {
                System.out.println("Right");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}
