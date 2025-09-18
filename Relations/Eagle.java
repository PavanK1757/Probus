class Eagle {
    public String species;
    public int age;
    public Wings wings;

    public Eagle(String species, int age, Wings wings) {
        this.species = species;
        this.age = age;
        this.wings = wings;
    }

    public void eagleDetails() {
        System.out.println("Eagle Species: " + species);
        System.out.println("Age: " + age + " years");
        System.out.println("Wingspan: " + wings.length + " meters");
        System.out.println("Wing Color: " + wings.color);
    }
}