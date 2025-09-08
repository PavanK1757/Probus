class PianoKeys {
    public static int keyId;
    public static String keyMaterial;
    public static long serialNumber;
    public static float length;
    public static double width;
    public static char keyNote;
    public static boolean isBlackKey;

    public PianoKeys(int keyId, String keyMaterial, long serialNumber, float length, double width, char keyNote, boolean isBlackKey) {
        
        // Print default values (before assignment)
        System.out.println("keyId = " + this.keyId);
        System.out.println("keyMaterial = " + this.keyMaterial);
        System.out.println("serialNumber = " + this.serialNumber);
        System.out.println("length = " + this.length);
        System.out.println("width = " + this.width);
        System.out.println("keyNote = " + this.keyNote);
        System.out.println("isBlackKey = " + this.isBlackKey);

        // Assign values
        this.keyId = keyId;
        this.keyMaterial = keyMaterial;
        this.serialNumber = serialNumber;
        this.length = length;
        this.width = width;
        this.keyNote = keyNote;
        this.isBlackKey = isBlackKey;

        // Print values after assignment
        System.out.println("keyId = " + this.keyId);
        System.out.println("keyMaterial = " + this.keyMaterial);
        System.out.println("serialNumber = " + this.serialNumber);
        System.out.println("length = " + this.length);
        System.out.println("width = " + this.width);
        System.out.println("keyNote = " + this.keyNote);
        System.out.println("isBlackKey = " + this.isBlackKey);
    }
}


