class TeacherRunner {
    public static void main(String[] args) {
        String[] names = {"Ramesh", "Suresh", "Geetha", "Anita"};
        String[] teacherList = Teacher.teacherNames(names);
        for (int nameIndex = 0; nameIndex < teacherList.length; nameIndex++) {
            System.out.println(teacherList[nameIndex]);
        }

        int[] ages = {40, 35, 50, 29};
        int[] teacherAges = Teacher.teacherAges(ages);
        for (int ageIndex = 0; ageIndex < teacherAges.length; ageIndex++) {
            System.out.println(teacherAges[ageIndex]);
        }

        double[] salaries = {45000.0, 50000.0, 60000.0, 40000.0};
        double[] teacherSalaries = Teacher.teacherSalaries(salaries);
        for (int salaryIndex = 0; salaryIndex < teacherSalaries.length; salaryIndex++) {
            System.out.println(teacherSalaries[salaryIndex]);
        }

        float[] experiences = {12.5f, 10.0f, 20.0f, 5.5f};
        float[] teacherExperience = Teacher.teacherExperience(experiences);
        for (int experienceIndex = 0; experienceIndex < teacherExperience.length; experienceIndex++) {
            System.out.println(teacherExperience[experienceIndex]);
        }

        boolean[] isPermanent = {true, false, true, false};
        boolean[] teacherStatus = Teacher.teacherIsPermanent(isPermanent);
        for (int statusIndex = 0; statusIndex < teacherStatus.length; statusIndex++) {
            System.out.println(teacherStatus[statusIndex]);
        }

        char[] grades = {'A', 'B', 'A', 'C'};
        char[] teacherGrades = Teacher.teacherGrades(grades);
        for (int gradeIndex = 0; gradeIndex < teacherGrades.length; gradeIndex++) {
            System.out.println(teacherGrades[gradeIndex]);
        }

        long[] ids = {101L, 102L, 103L, 104L};
        long[] teacherIds = Teacher.teacherIds(ids);
        for (int idIndex = 0; idIndex < teacherIds.length; idIndex++) {
            System.out.println(teacherIds[idIndex]);
        }
    }
}
