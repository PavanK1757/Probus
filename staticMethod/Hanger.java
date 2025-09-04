class Hanger {
    public static int price;
    public static double length;
    public static float thickness;
    public static String material;
    public static char grade;
    public static long serialNumber;
    public static boolean strong;

    public static void hold() {
        System.out.println(price);
        price = 150;
        System.out.println(price);

        System.out.println(length);
        length = 1.2;
        System.out.println(length);

        System.out.println(thickness);
        thickness = 0.5f;
        System.out.println(thickness);

        System.out.println(material);
        material = "Wood";
        System.out.println(material);

        System.out.println(grade);
        grade = 'B';
        System.out.println(grade);

        System.out.println(serialNumber);
        serialNumber = 9988776655L;
        System.out.println(serialNumber);

        System.out.println(strong);
        strong = true;
        System.out.println(strong);
    }
}


