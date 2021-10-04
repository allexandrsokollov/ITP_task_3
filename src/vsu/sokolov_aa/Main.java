package vsu.sokolov_aa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public  static final HorizontalParabola parabola = new HorizontalParabola(1.75, -1.5, -0.25);
    public static final double MAX_X_VALUE = 10, MAX_Y_VALUE = 10;
    public static final double MIN_X_VALUE = -10, MIN_Y_VALUE = -10;
    public static final Circle bigCircle = new Circle(1,-3,4);
    public static final Circle smallCircle = new Circle(-2,-5,2);

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        double x, y;

        if(!TesterForGetColor.testGetColor()) {
            System.out.println("It works incorrect!!!!");
            return;
        }

        do {
            x = getDoubleFromConsole("Enter X");
            y = getDoubleFromConsole("Enter Y");

            printColorForPoint(x, y);
        } while (x <= MAX_X_VALUE && x >= MIN_X_VALUE && y <= MAX_Y_VALUE && y >= MIN_Y_VALUE);

    }

    public static SimpleColor getColor(double x, double y) {
        SimpleColor color;

        if(parabola.isPointRightOfParabola(x, y)) {
            if(bigCircle.isPointInsideCircle(x, y)) {
                color = SimpleColor.BLUE;
            } else {
                color = SimpleColor.GRAY;
            }
        } else if (bigCircle.isPointInsideCircle(x, y)) {
             if(smallCircle.isPointInsideCircle(x, y)) {
                 color = SimpleColor.WHITE;
             } else {
                 color = SimpleColor.GRAY;
             }
        } else if (smallCircle.isPointInsideCircle(x, y)) {
            color = SimpleColor.ORANGE;
        } else {
            color = SimpleColor.WHITE;
        }

        return color;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.println("color is " + getColor(x, y) + "\n\n");
    }

    public static double getDoubleFromConsole(String massage) {
        Scanner in = new Scanner(System.in);
        System.out.print(massage + ": ");
        return in.nextDouble();
    }
}
