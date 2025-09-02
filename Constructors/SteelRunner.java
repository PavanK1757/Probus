class SteelRunner {
    public static void main(String[] args) {

        new Steel();
        new Steel(50000);
        new Steel(12.5, "TMT");
        new Steel("Stainless", 8);
        new Steel(7.8f, 250.0);
        new Steel('A', "Tata Steel");
        new Steel(true, 2);
        new Steel(1234567890L, 'S');
    }
}