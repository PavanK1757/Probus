class Stone {
    public String type = "Granite";
    public int weight;
    public double hardness;
    public float density;
    public long age;
    public boolean precious;
    public char grade;

    public String stoneType() {
        System.out.println(type);
        type = "Marble";
        System.out.println(type);
        return type;
    }

    public int stoneWeight() {
        System.out.println(weight);
        weight = 250;
        System.out.println(weight);
        return weight;
    }

    public double stoneHardness() {
        System.out.println(hardness);
        hardness = 7.8;
        System.out.println(hardness);
        return hardness;
    }

    public float stoneDensity() {
        System.out.println(density);
        density = 2.9f;
        System.out.println(density);
        return density;
    }

    public char stoneGrade() {
        System.out.println(grade);
        grade = 'A';
        System.out.println(grade);
        return grade;
    }
}

