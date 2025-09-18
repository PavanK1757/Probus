class Watch {
    public String brand;
    public double price;
    public Strap strap;

    public Watch(String brand, double price, Strap strap) {
        this.brand = brand;
        this.price = price;
        this.strap = strap;
    }

    public void watchDetails() {
        System.out.println("Watch Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Strap Material: " + strap.material);
        System.out.println("Strap Color: " + strap.color);
    }
}