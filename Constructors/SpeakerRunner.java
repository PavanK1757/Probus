class SpeakerRunner {
    public static void main(String[] args) {

        new Speaker();
        new Speaker(4999);
        new Speaker(60.5, "JBL");
        new Speaker("Black", 2);
        new Speaker(3.4f, 25.5);
        new Speaker('M', "Portable");
        new Speaker(true, 4);
        new Speaker(9876543210L, 'S');
    }
}
