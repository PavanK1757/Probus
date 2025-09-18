class WatchRunner {
    public static void main(String[] args) {
        Strap strap = new Strap("Leather", "Black");
        Watch watch = new Watch("Rolex", 15000.0, strap);
        watch.watchDetails();
    }
}