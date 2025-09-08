class Boult {
    Boult() {
        this(1500);
    }

    Boult(int price) {
        this(price, "Wireless Earbuds");
    }

    Boult(int price, String model) {
        this(price, model, 987654321L);
    }

    Boult(int price, String model, long serialNo) {
        this(price, model, serialNo, 2.5f);
    }

    Boult(int price, String model, long serialNo, float weight) {
        this(price, model, serialNo, weight, 10.5d);
    }

    Boult(int price, String model, long serialNo, float weight, double version) {
        this(price, model, serialNo, weight, version, 'A');
    }

    Boult(int price, String model, long serialNo, float weight, double version, char grade) {
        this(price, model, serialNo, weight, version, grade, true);
    }

    Boult(int price, String model, long serialNo, float weight, double version, char grade, boolean bluetooth) {
        System.out.println(price);
        System.out.println(model);
        System.out.println(serialNo);
        System.out.println(weight);
        System.out.println(version);
        System.out.println(grade);
        System.out.println(bluetooth);
    }
}
