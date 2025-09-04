class Car {
    public static void main(String[] args) {
        int maruti = 500;
        int honda = 700;
        int bmw = 1200;
        int audi = 1500;
        int tata = 600;
        int tesla = 2000;

        int[] Cars = {maruti, honda, bmw, audi, tata, tesla};
        int kia = 800;
        Cars[3] = kia;
        System.out.println("Updated Car Value: " + Cars[3]);

        for (int car = 0; car < Cars.length; car++) {
            System.out.println(Cars[car]);
        }
    }
}