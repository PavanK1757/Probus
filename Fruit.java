class Fruit {
    public static void main(String[] args) {
        int apple = 100;
        int mango = 60;
        int banana = 40;
        int orange = 80;
        int grapes = 120;
        int papaya = 70;

        int[] Fruits = {apple, mango, banana, orange, grapes, papaya};
        int pineapple = 90;
        Fruits[0] = pineapple;
        System.out.println("Updated Fruit Value: " + Fruits[0]);

        for (int fruit = 0; fruit < Fruits.length; fruit++) {
            System.out.println(Fruits[fruit]);
        }
    }
}
