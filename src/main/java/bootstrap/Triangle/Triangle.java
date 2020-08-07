package bootstrap.Triangle;

import bootstrap.IsShape;

public class Triangle implements IsShape {

    double base,height,side;

    public Square(double base, double height, double side){
        this.base = base;
        this.height=height;
        this.side=side;
    }

    @Override
    public double getArea() {
        return (base * height)/2;
    }

    @Override
    public double getPerimeter() {
        return base + height + side;
    }
}
