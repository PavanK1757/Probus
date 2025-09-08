class Cloud {
    public static int cloudId;
    public static String cloudName;
    public static long cloudDensity;
    public static float cloudHeight;
    public static double cloudArea;
    public static char cloudTypeCode;
    public static boolean rains;

    public Cloud(int cloudId, String cloudName, long cloudDensity, float cloudHeight, double cloudArea, char cloudTypeCode, boolean rains) {
        
        System.out.println("first try = " + this.cloudId);
        System.out.println("first try = " + this.cloudName);
        System.out.println("first try = " + this.cloudDensity);
        System.out.println("first try = " + this.cloudHeight);
        System.out.println("first try = " + this.cloudArea);
        System.out.println("first try = " + this.cloudTypeCode);
        System.out.println("first try = " + this.rains);

        this.cloudId = cloudId;
        this.cloudName = cloudName;
        this.cloudDensity = cloudDensity;
        this.cloudHeight = cloudHeight;
        this.cloudArea = cloudArea;
        this.cloudTypeCode = cloudTypeCode;
        this.rains = rains;

        System.out.println("second try = " + this.cloudId);
        System.out.println("second try = " + this.cloudName);
        System.out.println("second try = " + this.cloudDensity);
        System.out.println("second try = " + this.cloudHeight);
        System.out.println("second try = " + this.cloudArea);
        System.out.println("second try = " + this.cloudTypeCode);
        System.out.println("second try = " + this.rains);
    }
}


