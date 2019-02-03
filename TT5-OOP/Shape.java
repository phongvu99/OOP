abstract class Shape {
    double calArea() {
        return 0;
    }

    double calVolume() {
        return 0;
    }

    abstract String getName();
}

class Point extends Shape {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    double calArea() {
        return super.calArea();
    }

    @Override
    double calVolume() {
        return super.calVolume();
    }

    @Override
    String getName() {
        return "Point";
    }
}

class Circle extends Point {
    double r;

    Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    @Override
    double calArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    double calVolume() {
        System.out.println("A circle does not have a volume");
        return super.calVolume();
    }

    @Override
    String getName() {
        return "Circle";
    }
}

class Cylinder extends Circle {
    private double h;

    Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    @Override
    double calArea() {
        return 2 * Math.PI * r * (h + r);
    }

    @Override
    double calVolume() {
        return Math.PI * Math.pow(r, 2) * h;
    }

    @Override
    String getName() {
        return "Cylinder";
    }
}
