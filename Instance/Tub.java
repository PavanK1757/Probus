class Tub {
    public String material = "Plastic";
    public int capacity;
    public double price;
    public float height;
    public long serialNumber;
    public boolean filled;
    public char grade;

    public String tubMaterial() {
        System.out.println(material);
        material = "Steel";
        System.out.println(material);
        return material;
    }

    public int tubCapacity() {
        System.out.println(capacity);
        capacity = 50; // in liters
        System.out.println(capacity);
        return capacity;
    }

    public double tubPrice() {
        System.out.println(price);
        price = 1200.75;
        System.out.println(price);
        return price;
    }

    public float tubHeight() {
        System.out.println(height);
        height = 2.5f; // in feet
        System.out.println(height);
        return height;
    }

    public char tubGrade() {
        System.out.println(grade);
        grade = 'B';
        System.out.println(grade);
        return grade;
    }
}

