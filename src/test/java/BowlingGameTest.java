import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {

    public static final Integer missAllScores = 0;
    public static final Integer allHitScores = 300;
    public static final Integer TotalScore = 276;

    @Test
    void should_return_0_when_convert_given_not_score_of_per_round(){
        BowlingGame bowlingGame = new BowlingGame();
        final Integer [] perScore ={0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Integer totalScore = bowlingGame.convert(perScore);
        assertEquals(missAllScores, totalScore);

    }

    @Test
    void should_return_300_when_convert_given_score_of_per_round(){
        BowlingGame bowlingGame = new BowlingGame();
        final Integer [] perScore ={10,10,10,10,10,10,10,10,10,10,10,10};
        Integer totalScore = bowlingGame.convert(perScore);
        assertEquals(allHitScores, totalScore);

    }

    @Test
    void should_return_totalScore_when_convert_given_score_of_per_round(){
        BowlingGame bowlingGame = new BowlingGame();
        final Integer [] perScore ={10,10,10,10,10,10,10,10,10,10,1,4};
        Integer totalScore = bowlingGame.convert(perScore);
        assertEquals(TotalScore, totalScore);

    }






}