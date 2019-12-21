public class Util {
    private Util() {}

    public static int area(Rect rect) {
        return (rect.bottomRight.x - rect.topLeft.x) *
                (rect.bottomRight.y - rect.topLeft.y);
    }

    public static int perimeter(Rect rect) {
        return (rect.bottomRight.x - rect.topLeft.x) * 2 +
                (rect.bottomRight.y - rect.topLeft.y) * 2;
    }

    public static boolean isSquare(Rect rect) {
        return (rect.topLeft.y - rect.bottomRight.y) == (rect.bottomRight.x - rect.topLeft.x);
    }

}
