class FruitRunner {
    public static void main(String[] args) {
        String[] names = {"Apple", "Banana", "Mango", "Orange"};
        String[] fruits = Fruits.fruitName(names);
        for (int f = 0; f < fruits.length; f++) {
            System.out.println(fruits[f]);
        }

        int[] prices = {100, 50, 120, 80};
        int[] fruitPrices = Fruits.fruitPrice(prices);
        for (int cost = 0; cost < fruitPrices.length; cost++) {
            System.out.println(fruitPrices[cost]);
        }

        double[] weight = {1.2, 1.5, 2.0, 1.8};
        double[] fruitWeights = Fruits.fruitWeight(weight);
        for (int w = 0; w < fruitWeights.length; w++) {
            System.out.println(fruitWeights[w]);
        }

        float[] qty = {10.5f, 20.0f, 15.2f, 8.7f};
        float[] fruitQty = Fruits.fruitQty(qty);
        for (int q = 0; q < fruitQty.length; q++) {
            System.out.println(fruitQty[q]);
        }

        boolean[] fresh = {true, true, false, true};
        boolean[] fruitFresh = Fruits.fruitIsFresh(fresh);
        for (int check = 0; check < fruitFresh.length; check++) {
            System.out.println(fruitFresh[check]);
        }

        char[] symbol = {'F', 'R', 'U', 'I', 'T'};
        char[] fruitSymbols = Fruits.fruitSymbol(symbol);
        for (int c = 0; c < fruitSymbols.length; c++) {
            System.out.println(fruitSymbols[c]);
        }

        long[] code = {111, 222, 333, 444};
        long[] fruitCodes = Fruits.fruitCode(code);
        for (int cd = 0; cd < fruitCodes.length; cd++) {
            System.out.println(fruitCodes[cd]);
        }
    }
}
