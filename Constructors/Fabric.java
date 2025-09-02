class Fabric {

    Fabric() {
        System.out.println("Default constructor");
    }

    Fabric(int price) {
        System.out.println("Price = " + price + " per meter");
    }

    Fabric(double length, String material) {
        System.out.println("Length " + length + " meters, Material " + material);
    }

    Fabric(String color, int gsm) {
        System.out.println("Color " + color + ", GSM " + gsm);
    }

    Fabric(float thickness, double width) {
        System.out.println("Thickness " + thickness + " mm, Width " + width + " inches");
    }

    Fabric(char grade, String brand) {
        System.out.println("Grade " + grade + ", Brand " + brand);
    }

    Fabric(boolean washable, int warranty) {
        System.out.println("Washable " + washable + ", Warranty " + warranty + " months");
    }

    Fabric(long batchNo, char category) {
        System.out.println("Batch No " + batchNo + ", Category " + category);
    }
}


