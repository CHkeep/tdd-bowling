import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BowlingGame {
    public static final int allHitScores = 300;
    public static final int missAllScores = 0;
    public static final int allHit = 12;
    public static final int missAll = 20;
    public static int ROUND = 0;

    public Integer convert(Integer[] perScore) {
        List<Integer> results = Arrays.stream(perScore).filter(c -> c == 0 || c==10).collect(Collectors.toList());
        int roundTime = results.size();
        if (roundTime == allHit) {
            return allHitScores;
        }
        if (roundTime == missAll) return missAllScores;

        return getTotalScore(perScore);


    }

    private int getTotalScore(Integer[] perScore) {
        int totalScore = 0;
        for (int i = 2; i < perScore.length; i++) {
            totalScore += getRoundScore(i,perScore);
            i += ROUND;
        }
        return totalScore;

    }

    private int getRoundScore(int i, Integer[] perScore) {
        int roundScore = 0;
        if(perScore[i-2] == 10){
            roundScore = perScore[i-2] + perScore[i-1] + perScore[i];
            ROUND = 0;
        }
        if(perScore[i-2]+perScore[i-1] == 10){
            roundScore = perScore[i-2] + perScore[i-1] + perScore[i];
            ROUND = 1;

        }
        if(perScore[i-2]+perScore[i-1] < 10){
            roundScore = perScore[i-2] + perScore[i-1];
            ROUND = 1;
        }
        return  roundScore;

    }

}
