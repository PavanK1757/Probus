class Engine {

    Engine() {
        System.out.println("Default constructor");
    }

    Engine(int horsepower) {
        System.out.println("Horsepower = " + horsepower + " HP");
    }

    Engine(double capacity, String type) {
        System.out.println("Capacity " + capacity + "L, Type " + type);
    }

    Engine(String fuel, int cylinders) {
        System.out.println("Fuel " + fuel + ", Cylinders " + cylinders);
    }

    Engine(float weight, double efficiency) {
        System.out.println("Weight " + weight + " kg, Efficiency " + efficiency + " km/l");
    }

    Engine(char grade, String manufacturer) {
        System.out.println("Grade " + grade + ", Manufacturer " + manufacturer);
    }

    Engine(boolean turbo, int rpm) {
        System.out.println("Turbo " + turbo + ", Max RPM " + rpm);
    }

    Engine(long serialNo, char category) {
        System.out.println("SerialNo " + serialNo + ", Category " + category);
    }
}


