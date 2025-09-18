class Koala {
    public String name;
    public int age;
    public Tree tree;

    public Koala(String name, int age, Tree tree) {
        this.name = name;
        this.age = age;
        this.tree = tree;
    }

    public void koalaDetails() {
        System.out.println("Koala Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Lives on Tree: " + tree.type);
        System.out.println("Tree Location: " + tree.location);
    }
}