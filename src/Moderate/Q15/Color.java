package Moderate.Q15;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Possible colors
 */
public enum  Color {
    RED(0), YELLOW(1), GREEN(2), BLUE(3);

    int colorCode;

    Color(int colorCode) {
        this.colorCode = colorCode;
    }

    public static Color getColor(int colorCode){
        for (Color type : Color.values()) {
            if (type.colorCode == colorCode)
                return type;
        }
        return RED;
    }
}
