package Moderate.Q13;

/**
 * Created by Nicolas on 17/1/2018.
 */
public class Square {
    Point topLeft, bottomLeft, topRight, bottomRight;

    public Square(Point topLeft, Point bottomLeft, Point topRight, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
        this.bottomRight = bottomRight;
    }

    public Point getCenter(){

        int x = (topLeft.x + bottomRight.x)/2;
        int y = (topLeft.y + bottomRight.y)/2;

        return new Point(x, y);
    }




}
