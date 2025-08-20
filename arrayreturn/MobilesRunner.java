class MobilesRunner {
    public static void main(String[] args) {
        String[] names = {"Samsung", "Apple", "OnePlus", "Realme"};
        String[] mobiles = Mobiles.mobileName(names);
        for (int brand = 0; brand < mobiles.length; brand++) {
            System.out.println(mobiles[brand]);
        }

        int[] prices = {20000, 70000, 45000, 15000};
        int[] mobilePrices = Mobiles.mobilePrice(prices);
        for (int amount = 0; amount < mobilePrices.length; amount++) {
            System.out.println(mobilePrices[amount]);
        }

        double[] version = {11.0, 12.1, 13.0, 10.5};
        double[] mobileVersions = Mobiles.mobileVersion(version);
        for (int ver = 0; ver < mobileVersions.length; ver++) {
            System.out.println(mobileVersions[ver]);
        }

        float[] size = {6.5f, 6.1f, 6.7f, 6.2f};
        float[] mobileSizes = Mobiles.mobileSize(size);
        for (int screen = 0; screen < mobileSizes.length; screen++) {
            System.out.println(mobileSizes[screen]);
        }

        boolean[] fiveg = {true, true, false, true};
        boolean[] mobile5G = Mobiles.mobileIs5G(fiveg);
        for (int net = 0; net < mobile5G.length; net++) {
            System.out.println(mobile5G[net]);
        }

        char[] symbol = {'M', 'O', 'B'};
        char[] mobileSymbol = Mobiles.mobileSymbol(symbol);
        for (int sign = 0; sign < mobileSymbol.length; sign++) {
            System.out.println(mobileSymbol[sign]);
        }

        long[] imei = {9876543211L, 1234567890L, 5647382910L, 6789012345L};
        long[] mobileImei = Mobiles.mobileImei(imei);
        for (int id = 0; id < mobileImei.length; id++) {
            System.out.println(mobileImei[id]);
        }
    }
}
