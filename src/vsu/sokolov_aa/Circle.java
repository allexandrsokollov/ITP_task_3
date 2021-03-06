package vsu.sokolov_aa;

public class Circle {
    private final double a;
    private final double b;
    private final double R;

    public Circle(double a, double b, double r) {
        this.a = a;
        this.b = b;
        R = r;
    }

    public boolean isPointInsideCircle(double x, double y) {
        return R >= Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
    }
}
