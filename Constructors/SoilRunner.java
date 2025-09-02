class SoilRunner {
    public static void main(String[] args) {

        new Soil();
        new Soil(300);
        new Soil(12.5, "Clay");
        new Soil("Black", 85);
        new Soil(1.3f, 6.8);
        new Soil('B', "Karnataka");
        new Soil(true, 5);
        new Soil(9876543210L, 'L');
    }
}