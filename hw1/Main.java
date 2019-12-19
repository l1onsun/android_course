public class Main {

    private static double pointDistance(Point a, Point b) {
        int xgap = a.x - b.x;
        int ygap = a.y - b.y;
        return Math.sqrt(xgap*xgap + ygap*ygap);
    }

    public static void main(String[] args) {
        Point first = new Point(0, 0);
        Point second = new Point(3, -4);
        System.out.println(pointDistance(first, second));
    }
}
