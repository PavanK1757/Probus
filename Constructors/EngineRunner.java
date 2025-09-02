class EngineRunner {
    public static void main(String[] args) {

        new Engine();
        new Engine(150);
        new Engine(2.0, "Petrol");
        new Engine("Diesel", 4);
        new Engine(220.5f, 18.7);
        new Engine('A', "Bosch");
        new Engine(true, 7000);
        new Engine(5566778899L, 'E');
    }
}
