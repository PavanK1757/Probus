class Soil {

    Soil() {
        System.out.println("Default constructor");
    }

    Soil(int cost) {
        System.out.println("Cost = " + cost + " per ton");
    }

    Soil(double moisture, String type) {
        System.out.println("Moisture " + moisture + "%, Type " + type);
    }

    Soil(String color, int fertility) {
        System.out.println("Color " + color + ", Fertility " + fertility + "%");
    }

    Soil(float density, double pH) {
        System.out.println("Density " + density + " g/cm³, pH " + pH);
    }

    Soil(char grade, String region) {
        System.out.println("Grade " + grade + ", Region " + region);
    }

    Soil(boolean fertile, int yearsUsed) {
        System.out.println("Fertile " + fertile + ", Years Used " + yearsUsed);
    }

    Soil(long surveyNo, char category) {
        System.out.println("Survey No " + surveyNo + ", Category " + category);
    }
}


