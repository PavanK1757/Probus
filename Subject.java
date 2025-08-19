class Subject {
    public static void main(String[] args) {
        int maths = 100;
        int science = 95;
        int english = 90;
        int history = 85;
        int geography = 80;
        int computer = 99;

        int[] Subjects = {maths, science, english, history, geography, computer};
        int economics = 88;
        Subjects[3] = economics;
        System.out.println("Updated Subject Value: " + Subjects[3]);

        for (int subject = 0; subject < Subjects.length; subject++) {
            System.out.println(Subjects[subject]);
        }
    }
}