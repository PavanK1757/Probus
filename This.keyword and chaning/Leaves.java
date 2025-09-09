class Leaves {
    public static int leafId;
    public static String leafName;
    public static long leafCount;
    public static float leafLength;
    public static double leafWidth;
    public static char leafCode;
    public static boolean isMedicinal;

    public Leaves(int leafId, String leafName, long leafCount, float leafLength, double leafWidth, char leafCode, boolean isMedicinal) {
        
        System.out.println("first try = " + this.leafId);
        System.out.println("first try = " + this.leafName);
        System.out.println("first try = " + this.leafCount);
        System.out.println("first try = " + this.leafLength);
        System.out.println("first try = " + this.leafWidth);
        System.out.println("first try = " + this.leafCode);
        System.out.println("first try = " + this.isMedicinal);

        this.leafId = leafId;
        this.leafName = leafName;
        this.leafCount = leafCount;
        this.leafLength = leafLength;
        this.leafWidth = leafWidth;
        this.leafCode = leafCode;
        this.isMedicinal = isMedicinal;

        System.out.println("second try = " + this.leafId);
        System.out.println("second try = " + this.leafName);
        System.out.println("second try = " + this.leafCount);
        System.out.println("second try = " + this.leafLength);
        System.out.println("second try = " + this.leafWidth);
        System.out.println("second try = " + this.leafCode);
        System.out.println("second try = " + this.isMedicinal);
    }
}

