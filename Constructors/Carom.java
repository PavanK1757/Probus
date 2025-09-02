class Carom {

    Carom() {
        System.out.println("Default constructor");
    }

    Carom(int price) {
        System.out.println("Price = " + price);
    }

    Carom(double size, String brand) {
        System.out.println("Size " + size + " inches, Brand " + brand);
    }

    Carom(String color, int coins) {
        System.out.println("Color " + color + ", Coins " + coins);
    }

    Carom(float weight, double thickness) {
        System.out.println("Weight " + weight + " kg, Thickness " + thickness + " cm");
    }

    Carom(char type, String material) {
        System.out.println("Type " + type + ", Material " + material);
    }

    Carom(boolean tournament, int players) {
        System.out.println("Tournament board " + tournament + ", Max Players " + players);
    }

    Carom(long serialNo, char category) {
        System.out.println("SerialNo " + serialNo + ", Category " + category);
    }
}


