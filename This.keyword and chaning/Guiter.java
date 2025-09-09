class Guiter {
    public static int guiterId;
    public static String brand;
    public static long serialNumber;
    public static float weight;
    public static double price;
    public static char grade;
    public static boolean isElectric;

    public Guiter(int guiterId, String brand, long serialNumber, float weight, double price, char grade, boolean isElectric) {
        
        // Print default values (before assignment)
        System.out.println("guiterId = " + this.guiterId);
        System.out.println("brand = " + this.brand);
        System.out.println("serialNumber = " + this.serialNumber);
        System.out.println("weight = " + this.weight);
        System.out.println("price = " + this.price);
        System.out.println("grade = " + this.grade);
        System.out.println("isElectric = " + this.isElectric);

        // Assign values
        this.guiterId = guiterId;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.weight = weight;
        this.price = price;
        this.grade = grade;
        this.isElectric = isElectric;

        // Print values after assignment
        System.out.println("guiterId = " + this.guiterId);
        System.out.println("brand = " + this.brand);
        System.out.println("serialNumber = " + this.serialNumber);
        System.out.println("weight = " + this.weight);
        System.out.println("price = " + this.price);
        System.out.println("grade = " + this.grade);
        System.out.println("isElectric = " + this.isElectric);
    }
}

