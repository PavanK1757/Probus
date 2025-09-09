class Vampire {
    Vampire() {
        this("Dracula");
    }

    Vampire(String name) {
        this(name, 500);
    }

    Vampire(String name, int age) {
        this(name, age, "Transylvania");
    }

    Vampire(String name, int age, String location) {
        this(name, age, location, 123456789L);
    }

    Vampire(String name, int age, String location, long id) {
        this(name, age, location, id, 22.5f);
    }

    Vampire(String name, int age, String location, long id, float strength) {
        this(name, age, location, id, strength, 5.5d);
    }

    Vampire(String name, int age, String location, long id, float strength, double speed) {
        this(name, age, location, id, strength, speed, 'A');
    }

    Vampire(String name, int age, String location, long id, float strength, double speed, char grade) {
        this(name, age, location, id, strength, speed, grade, true);
    }

    Vampire(String name, int age, String location, long id, float strength, double speed, char grade, boolean immortal) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(location);
        System.out.println(id);
        System.out.println(strength);
        System.out.println(speed);
        System.out.println(grade);
        System.out.println(immortal);
    }
}
