class Connecter {
    public static int price;
    public static double voltage;
    public static float current;
    public static String brand;
    public static char grade;
    public static long serialNumber;
    public static boolean original;

    public static void connect() {
        System.out.println(price);
        price = 450;
        System.out.println(price);

        System.out.println(voltage);
        voltage = 12.5;
        System.out.println(voltage);

        System.out.println(current);
        current = 1.8f;
        System.out.println(current);

        System.out.println(brand);
        brand = "Boat";
        System.out.println(brand);

        System.out.println(grade);
        grade = 'B';
        System.out.println(grade);

        System.out.println(serialNumber);
        serialNumber = 2233445566L;
        System.out.println(serialNumber);

        System.out.println(original);
        original = true;
        System.out.println(original);
    }
}


