class BikeRunner {
    public static void main(String[] args) {
        String[] names = {"Yamaha", "Ducati", "RoyalEnfield", "KTM"};
        String[] bikes = Bikee.bikeName(names);
        for (int model = 0; model < bikes.length; model++) {
            System.out.println(bikes[model]);
        }

        int[] price = {120000, 150000, 200000, 180000};
        int[] bikePrices = Bikee.bikePrice(price);
        for (int cost = 0; cost < bikePrices.length; cost++) {
            System.out.println(bikePrices[cost]);
        }

        double[] engine = {150.0, 200.5, 350.0, 500.0};
        double[] bikeEngines = Bikee.bikeEngine(engine);
        for (int cc = 0; cc < bikeEngines.length; cc++) {
            System.out.println(bikeEngines[cc]);
        }

        float[] mileage = {40.5f, 35.8f, 25.4f, 30.6f};
        float[] bikeMileage = Bikee.bikeMileage(mileage);
        for (int avg = 0; avg < bikeMileage.length; avg++) {
            System.out.println(bikeMileage[avg]);
        }

        boolean[] sports = {true, true, false, false};
        boolean[] bikeSports = Bikee.bikeIsSports(sports);
        for (int sport = 0; sport < bikeSports.length; sport++) {
            System.out.println(bikeSports[sport]);
        }

        char[] symbol = {'B', 'I', 'K', 'E'};
        char[] bikeSymbols = Bikee.bikeSymbol(symbol);
        for (int mark = 0; mark < bikeSymbols.length; mark++) {
            System.out.println(bikeSymbols[mark]);
        }

        long[] regNo = {98765432, 12345678, 56781234, 34567890};
        long[] bikeNumbers = Bikee.bikeNumber(regNo);
        for (int number = 0; number < bikeNumbers.length; number++) {
            System.out.println(bikeNumbers[number]);
        }
    }
}
