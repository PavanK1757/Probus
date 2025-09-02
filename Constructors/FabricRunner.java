class FabricRunner {
    public static void main(String[] args) {

        new Fabric();
        new Fabric(450);
        new Fabric(3.5, "Cotton");
        new Fabric("Blue", 120);
        new Fabric(0.5f, 44.0);
        new Fabric('A', "Raymonds");
        new Fabric(true, 6);
        new Fabric(1122334455L, 'F');
    }
}