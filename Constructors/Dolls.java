class Dolls {

    Dolls() {
        System.out.println("Default constructor");
    }

    Dolls(int price) {
        System.out.println("Price = " + price);
    }

    Dolls(double height, String name) {
        System.out.println("Height " + height + " cm, Name " + name);
    }

    Dolls(String color, int quantity) {
        System.out.println("Color " + color + ", Quantity " + quantity);
    }

    Dolls(float weight, double width) {
        System.out.println("Weight " + weight + " g, Width " + width + " cm");
    }

    Dolls(char size, String type) {
        System.out.println("Size " + size + ", Type " + type);
    }

    Dolls(boolean talking, int accessories) {
        System.out.println("Talking " + talking + ", Accessories " + accessories);
    }

    Dolls(long serialNo, char category) {
        System.out.println("SerialNo " + serialNo + ", Category " + category);
    }
}


