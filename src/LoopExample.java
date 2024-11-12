public class LoopExample {
    public static void main(String[] args) {
        int[] scores = {90, 85, 78, 92, 88};
        int totalScore = 0;

        for (int score : scores) {
            totalScore += score;
        }

        System.out.println("Total Score: " + totalScore);
    }
}
