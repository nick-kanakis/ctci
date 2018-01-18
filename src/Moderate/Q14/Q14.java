package Moderate.Q14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create all possible lines (NOT LINE SEGMENTS) and store them in a hashmap. The key to the hashmap will be the Line itself
 * and the value the occurrences.
 *
 * SOS -> each line will be represented as a yIntercept, slope and isHorizontal value. The isHorizontal is a boolean
 * that is true when the line is horizontal and does not meet the y-axis.
 */
public class Q14 {

    public static Line getBestLine(List<Point> points){
        Map<Line, Integer> lines = new HashMap<>();

        for (int i = 0; i < points.size(); i++) {
            Point tmpStart = points.get(i);
            for (int j = i+1; j < points.size(); j++) {
                Point tmpEnd = points.get(j);
                Line tmpLine = new Line(tmpStart, tmpEnd);

                Integer numberOfOccurencesForThisLine = lines.get(tmpLine);

                if(numberOfOccurencesForThisLine == null){
                    lines.put(tmpLine, 1);
                } else{
                    lines.put(tmpLine, numberOfOccurencesForThisLine + 1 );
                }
            }
        }

        return getBestLine(lines);
    }

    private static Line getBestLine(Map<Line, Integer> lines) {
        Line bestLine = null;
        Integer maxOccurrences = -1;

        for (Line line : lines.keySet()) {
            Integer currentOccurrences = lines.get(line);
            if(currentOccurrences > maxOccurrences){
                bestLine = line;
                maxOccurrences = currentOccurrences;
            }
        }

        return bestLine;
    }
}
