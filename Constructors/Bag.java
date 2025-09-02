class Bag {

    Bag() {
        System.out.println("Default constructor");
    }

    Bag(int price) {
        System.out.println("Price = " + price);
    }

    Bag(double weight, String brand) {
        System.out.println("Weight " + weight + " kg, Brand " + brand);
    }

    Bag(String color, int capacity) {
        System.out.println("Color " + color + ", Capacity " + capacity + " liters");
    }

    Bag(float height, double width) {
        System.out.println("Height " + height + " cm, Width " + width + " cm");
    }

    Bag(char size, String type) {
        System.out.println("Size " + size + ", Type " + type);
    }

    Bag(boolean waterproof, int compartments) {
        System.out.println("Waterproof " + waterproof + ", Compartments " + compartments);
    }

    Bag(long barcode, char category) {
        System.out.println("Barcode " + barcode + ", Category " + category);
    }
}


