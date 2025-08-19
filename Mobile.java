class Mobile {
    public static void main(String[] args) {
        int samsung = 25000;
        int apple = 80000;
        int oneplus = 40000;
        int vivo = 20000;
        int oppo = 18000;
        int realme = 22000;

        int[] Mobiles = {samsung, apple, oneplus, vivo, oppo, realme};
        int mi = 15000;
        Mobiles[2] = mi;
        System.out.println("Updated Mobile Value: " + Mobiles[2]);

        for (int mobile = 0; mobile < Mobiles.length; mobile++) {
            System.out.println(Mobiles[mobile]);
        }
    }
}