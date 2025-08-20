class MovieRunner {
    public static void main(String[] args) {
        String[] titles = {"Inception", "KGF", "Interstellar", "RRR"};
        String[] movies = Movie.movieTitles(titles);
        for (int titleIndex = 0; titleIndex < movies.length; titleIndex++) {
            System.out.println(movies[titleIndex]);
        }

        int[] years = {2010, 2018, 2014, 2022};
        int[] movieYears = Movie.movieYears(years);
        for (int yearIndex = 0; yearIndex < movieYears.length; yearIndex++) {
            System.out.println(movieYears[yearIndex]);
        }

        double[] budgets = {160000000.0, 80000000.0, 165000000.0, 550000000.0};
        double[] movieBudgets = Movie.movieBudgets(budgets);
        for (int budgetIndex = 0; budgetIndex < movieBudgets.length; budgetIndex++) {
            System.out.println(movieBudgets[budgetIndex]);
        }

        float[] ratings = {8.8f, 8.5f, 8.6f, 9.0f};
        float[] movieRatings = Movie.movieRatings(ratings);
        for (int ratingIndex = 0; ratingIndex < movieRatings.length; ratingIndex++) {
            System.out.println(movieRatings[ratingIndex]);
        }

        boolean[] isHit = {true, true, true, true};
        boolean[] movieHits = Movie.movieIsHit(isHit);
        for (int hitIndex = 0; hitIndex < movieHits.length; hitIndex++) {
            System.out.println(movieHits[hitIndex]);
        }

        char[] grades = {'A', 'U', 'A', 'U'};
        char[] movieGrades = Movie.movieGrades(grades);
        for (int gradeIndex = 0; gradeIndex < movieGrades.length; gradeIndex++) {
            System.out.println(movieGrades[gradeIndex]);
        }

        long[] ids = {301L, 302L, 303L, 304L};
        long[] movieIds = Movie.movieIds(ids);
        for (int idIndex = 0; idIndex < movieIds.length; idIndex++) {
            System.out.println(movieIds[idIndex]);
        }
    }
}
