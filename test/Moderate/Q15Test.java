package Moderate;

import Moderate.Q15.Color;
import Moderate.Q15.Computer;
import Moderate.Q15.Player;
import Moderate.Q15.Result;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nicolas on 17/1/2018.
 */
public class Q15Test {

    @Test
    public void testQ15() throws Exception {
        Computer cp = new Computer();
        Player player = new Player();
        assertTrue(player.askQuestion(cp)>0);
    }

    @Test
    public void testGuess() throws Exception {
        Computer cp = new Computer("RGBY");
        List<Result> results = cp.guess("GGRR");

        assertTrue(results.size() == 2);
        assertTrue(results.get(0) == Result.HIT);
        assertTrue(results.get(1) == Result.PSEUDO_HIT);


    }
}
