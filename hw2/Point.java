public final class Point {

    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = this.y = 0;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }
}
