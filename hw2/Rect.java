public final class Rect {
    public final Point topLeft;
    public final Point bottomRight;

    Rect(Point topLeft, Point bottomRight) {
        if (topLeft.x > bottomRight.x || topLeft.y < bottomRight.y)
            throw new IllegalArgumentException();
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
}
