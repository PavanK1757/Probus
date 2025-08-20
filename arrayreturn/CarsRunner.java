class CarsRunner {
    public static void main(String[] args) {
        String[] names = {"BMW", "Audi", "Tesla", "Toyota"};
        String[] cars = Cars.carName(names);
        for (int brand = 0; brand < cars.length; brand++) {
            System.out.println(cars[brand]);
        }

        int[] prices = {6000000, 5000000, 7000000, 3000000};
        int[] carPrices = Cars.carPrice(prices);
        for (int cost = 0; cost < carPrices.length; cost++) {
            System.out.println(carPrices[cost]);
        }

        double[] mileage = {15.5, 12.8, 14.6, 18.2};
        double[] carMileage = Cars.carMileage(mileage);
        for (int avg = 0; avg < carMileage.length; avg++) {
            System.out.println(carMileage[avg]);
        }

        float[] speed = {220.5f, 240.8f, 260.3f, 200.0f};
        float[] carSpeed = Cars.carSpeed(speed);
        for (int maxSpeed = 0; maxSpeed < carSpeed.length; maxSpeed++) {
            System.out.println(carSpeed[maxSpeed]);
        }

        boolean[] electric = {false, false, true, false};
        boolean[] carElectric = Cars.carIsElectric(electric);
        for (int eco = 0; eco < carElectric.length; eco++) {
            System.out.println(carElectric[eco]);
        }

        char[] symbol = {'C', 'A', 'R'};
        char[] carSymbol = Cars.carSymbol(symbol);
        for (int letter = 0; letter < carSymbol.length; letter++) {
            System.out.println(carSymbol[letter]);
        }

        long[] numbers = {234567, 987654, 123456, 654321};
        long[] carNumbers = Cars.carNumber(numbers);
        for (int reg = 0; reg < carNumbers.length; reg++) {
            System.out.println(carNumbers[reg]);
        }
    }
}


