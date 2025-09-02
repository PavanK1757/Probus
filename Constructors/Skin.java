class Skin {

    Skin() {
        System.out.println("Default constructor");
    }

    Skin(int age) {
        System.out.println("Skin age = " + age + " years");
    }

    Skin(double moisture, String type) {
        System.out.println("Moisture " + moisture + "%, Type " + type);
    }

    Skin(String tone, int sensitivity) {
        System.out.println("Tone " + tone + ", Sensitivity Level " + sensitivity);
    }

    Skin(float thickness, double elasticity) {
        System.out.println("Thickness " + thickness + " mm, Elasticity " + elasticity + "%");
    }

    Skin(char grade, String region) {
        System.out.println("Grade " + grade + ", Region " + region);
    }

    Skin(boolean healthy, int scars) {
        System.out.println("Healthy " + healthy + ", Scars " + scars);
    }

    Skin(long idNo, char category) {
        System.out.println("ID No " + idNo + ", Category " + category);
    }
}

