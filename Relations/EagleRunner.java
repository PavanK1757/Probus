class EagleRunner {
    public static void main(String[] args) {
        Wings wings = new Wings(2.3, "Brown");
        Eagle eagle = new Eagle("Golden Eagle", 5, wings);
        eagle.eagleDetails();
    }
}