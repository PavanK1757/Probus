class Steel {

    Steel() {
        System.out.println("Default constructor");
    }

    Steel(int price) {
        System.out.println("Price = " + price);
    }

    Steel(double weight, String grade) {
        System.out.println("Weight " + weight + " tons, Grade " + grade);
    }

    Steel(String type, int thickness) {
        System.out.println("Type " + type + ", Thickness " + thickness + " mm");
    }

    Steel(float density, double strength) {
        System.out.println("Density " + density + " g/cm³, Strength " + strength + " MPa");
    }

    Steel(char quality, String manufacturer) {
        System.out.println("Quality " + quality + ", Manufacturer " + manufacturer);
    }

    Steel(boolean alloy, int carbonContent) {
        System.out.println("Alloy " + alloy + ", Carbon Content " + carbonContent + "%");
    }

    Steel(long batchNo, char category) {
        System.out.println("Batch No " + batchNo + ", Category " + category);
    }
}


