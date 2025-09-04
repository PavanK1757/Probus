class Mirror {
    public static int price;
    public static double height;
    public static float width;
    public static String shape;
    public static char grade;
    public static long serialNumber;
    public static boolean framed;

    public static void reflect() {
        System.out.println(price);
        price = 800;
        System.out.println(price);

        System.out.println(height);
        height = 5.5;
        System.out.println(height);

        System.out.println(width);
        width = 2.3f;
        System.out.println(width);

        System.out.println(shape);
        shape = "Round";
        System.out.println(shape);

        System.out.println(grade);
        grade = 'A';
        System.out.println(grade);

        System.out.println(serialNumber);
        serialNumber = 1122334455L;
        System.out.println(serialNumber);

        System.out.println(framed);
        framed = true;
        System.out.println(framed);
    }
}


