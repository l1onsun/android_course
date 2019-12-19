import java.util.Objects;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null)
//            return false;
//        if (this == obj)
//            return true;
//        if (obj.getClass() == this.getClass()) {
//            Point p = (Point) obj;
//            return p.x == this.x && p.y == this.y;
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x, y);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
