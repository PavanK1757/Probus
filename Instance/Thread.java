class Thread {
    public String type = "Single Thread";
    public int speed;
    public double length;
    public float thickness;
    public long batch;
    public boolean strong;
    public char grade;

    public String threadType() {
        System.out.println(type);
        type = "Multi Thread";
        System.out.println(type);
        return type;
    }

    public int threadSpeed() {
        System.out.println(speed);
        speed = 120;
        System.out.println(speed);
        return speed;
    }

    public double threadLength() {
        System.out.println(length);
        length = 45.7;
        System.out.println(length);
        return length;
    }

    public float threadThickness() {
        System.out.println(thickness);
        thickness = 2.5f;
        System.out.println(thickness);
        return thickness;
    }

    public char threadGrade() {
        System.out.println(grade);
        grade = 'A';
        System.out.println(grade);
        return grade;
    }
}

