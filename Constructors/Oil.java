class Oil {

    Oil() {
        System.out.println("Default constructor");
    }

    Oil(int price) {
        System.out.println("Price = " + price);
    }

    Oil(double quantity, String brand) {
        System.out.println("Quantity " + quantity + " liters, Brand " + brand);
    }

    Oil(String type, int viscosity) {
        System.out.println("Type " + type + ", Viscosity " + viscosity);
    }

    Oil(float density, double boilingPoint) {
        System.out.println("Density " + density + " g/cm³, Boiling Point " + boilingPoint + " °C");
    }

    Oil(char grade, String origin) {
        System.out.println("Grade " + grade + ", Origin " + origin);
    }

    Oil(boolean edible, int shelfLife) {
        System.out.println("Edible " + edible + ", Shelf Life " + shelfLife + " months");
    }

    Oil(long batchNo, char category) {
        System.out.println("Batch No " + batchNo + ", Category " + category);
    }
}


