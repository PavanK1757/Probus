class Piano {
    public static int pianoId;
    public static String pianoBrand;
    public static long serialNumber;
    public static float weight;
    public static double price;
    public static char grade;
    public static boolean isElectric;

    public Piano(int pianoId, String pianoBrand, long serialNumber, float weight, double price, char grade, boolean isElectric) {
        
        // Print default values (before assignment)
        System.out.println("pianoId = " + this.pianoId);
        System.out.println("pianoBrand = " + this.pianoBrand);
        System.out.println("serialNumber = " + this.serialNumber);
        System.out.println("weight = " + this.weight);
        System.out.println("price = " + this.price);
        System.out.println("grade = " + this.grade);
        System.out.println("isElectric = " + this.isElectric);

        // Assign values
        this.pianoId = pianoId;
        this.pianoBrand = pianoBrand;
        this.serialNumber = serialNumber;
        this.weight = weight;
        this.price = price;
        this.grade = grade;
        this.isElectric = isElectric;

        // Print values after assignment
        System.out.println("pianoId = " + this.pianoId);
        System.out.println("pianoBrand = " + this.pianoBrand);
        System.out.println("serialNumber = " + this.serialNumber);
        System.out.println("weight = " + this.weight);
        System.out.println("price = " + this.price);
        System.out.println("grade = " + this.grade);
        System.out.println("isElectric = " + this.isElectric);
    }
}


