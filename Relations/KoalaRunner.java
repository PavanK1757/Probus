class KoalaRunner {
    public static void main(String[] args) {
        Tree tree = new Tree("Eucalyptus", "Australia");
        Koala koala = new Koala("Koko", 7, tree);
        koala.koalaDetails();
    }
}