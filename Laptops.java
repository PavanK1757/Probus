class Laptops {
    public static void main(String[] args) {
        int dell = 45000;
        int hp = 50000;
        int lenovo = 40000;
        int acer = 35000;
        int mac = 100000;
        int asus = 60000;

        int[] Laptops = {dell, hp, lenovo, acer, mac, asus};
        int samsung = 55000;
        Laptops[1] = samsung;
        System.out.println("Updated Laptop Value: " + Laptops[1]);

        for (int laptop = 0; laptop < Laptops.length; laptop++) {
            System.out.println(Laptops[laptop]);
        }
    }
}
