public class MaxPopulationYear {
    public static int maximumPopulation(int[][] logs) {
        int[] yearChanges = new int[101];
        for (int[] log:logs) {
            int birth = log[0];
            int death = log[1];

            yearChanges[birth - 1950]++;
            yearChanges[death - 1950]--;   
        }
        int currentPopulation = 0;
        int maxPopulation = 0;
        int earliestYear = 1950;
        for (int i = 0; i < 101; i++) {
            currentPopulation += yearChanges[i];

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                earliestYear = i + 1950;
            }
        }
        return earliestYear;
    }
    public static void main(String[] args) {
        int[][] logs = {
            {1950, 1961},
            {1960, 1971},
            {1970, 1981}
        };
        System.out.println(maximumPopulation(logs));
    }
}
