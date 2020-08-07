package bootstrap.Circle;

import bootstrap.IsShape;

public class Square implements IsShape {

    double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14d * radius * radius ;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14d * radius;
    }
}
