class Speaker {

    Speaker() {
        System.out.println("Default constructor");
    }

    Speaker(int price) {
        System.out.println("Price = " + price);
    }

    Speaker(double power, String brand) {
        System.out.println("Power " + power + "W, Brand " + brand);
    }

    Speaker(String color, int warranty) {
        System.out.println("Color " + color + ", Warranty " + warranty + " years");
    }

    Speaker(float weight, double height) {
        System.out.println("Weight " + weight + " kg, Height " + height + " cm");
    }

    Speaker(char size, String type) {
        System.out.println("Size " + size + ", Type " + type);
    }

    Speaker(boolean bluetooth, int drivers) {
        System.out.println("Bluetooth " + bluetooth + ", Drivers " + drivers);
    }

    Speaker(long serialNo, char category) {
        System.out.println("SerialNo " + serialNo + ", Category " + category);
    }
}


