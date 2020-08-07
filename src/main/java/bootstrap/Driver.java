package bootstrap;

import bootstrap.Square.Square;

public class Driver {
    public static final String SEPARATOR =
            "==============================================================";

    public static void main(String[] args) {
        System.out.println(SEPARATOR);
        System.out.println("Hello and welcome to git training. Sanket");

        IsShape firstObject = new Square(2);

        System.out.println("Area of firstObject = " + firstObject.getArea());
        System.out.println("Perimeter of firstObject = " + firstObject.getPerimeter());

        System.out.println(SEPARATOR);
    }

    static int getOne() {
        int a = 1;
        return a;
    }
}
