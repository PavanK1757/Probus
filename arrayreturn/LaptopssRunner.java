class LaptopssRunner {
    public static void main(String[] args) {
        String[] names = {"Dell", "HP", "Asus", "Lenovo"};
        String[] laptops = Laptopss.laptopName(names);
        for (int brand = 0; brand < laptops.length; brand++) {
            System.out.println(laptops[brand]);
        }

        int[] prices = {50000, 60000, 70000, 45000};
        int[] laptopPrices = Laptopss.laptopPrice(prices);
        for (int amount = 0; amount < laptopPrices.length; amount++) {
            System.out.println(laptopPrices[amount]);
        }

        double[] ghz = {2.4, 3.1, 3.6, 2.9};
        double[] laptopProcessors = Laptopss.laptopProcessor(ghz);
        for (int power = 0; power < laptopProcessors.length; power++) {
            System.out.println(laptopProcessors[power]);
        }

        float[] size = {15.6f, 14.0f, 13.3f, 16.0f};
        float[] laptopScreens = Laptopss.laptopScreen(size);
        for (int display = 0; display < laptopScreens.length; display++) {
            System.out.println(laptopScreens[display]);
        }

        boolean[] gaming = {true, false, true, false};
        boolean[] laptopGaming = Laptopss.laptopIsGaming(gaming);
        for (int use = 0; use < laptopGaming.length; use++) {
            System.out.println(laptopGaming[use]);
        }

        char[] symbol = {'L', 'A', 'P', 'T', 'O', 'P'};
        char[] laptopSymbols = Laptopss.laptopSymbol(symbol);
        for (int mark = 0; mark < laptopSymbols.length; mark++) {
            System.out.println(laptopSymbols[mark]);
        }

        long[] serial = {87654321, 98765432, 12345678, 23456789};
        long[] laptopSerials = Laptopss.laptopSerial(serial);
        for (int code = 0; code < laptopSerials.length; code++) {
            System.out.println(laptopSerials[code]);
        }
    }
}
