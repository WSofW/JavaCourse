package third_lesson.src;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Rect {
    private final Point topLeft;
    private final Point bottomRight;

    public Rect(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getArea() {
        int width = Math.abs(bottomRight.getX() - topLeft.getX());
        int height = Math.abs(bottomRight.getY() - topLeft.getY());
        return width * height;
    }
}

