interface Shape_Interface {
    double calArea();

    double calVolume();

    String getName();
}

class Point_Interface implements Shape_Interface {
    double x, y;

    Point_Interface(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calArea() {
        return 0;
    }

    @Override
    public double calVolume() {
        return 0;
    }

    @Override
    public String getName() {
        return "Point";
    }
}

class Circle_Interface extends Point_Interface implements Shape_Interface {
    double r;

    Circle_Interface(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public double calArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calVolume() {
        System.out.println("A circle does not have a volume");
        return 0;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}

class Cylinder_Interface extends Circle_Interface implements Shape_Interface {
    private double h;

    Cylinder_Interface(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    @Override
    public double calArea() {
        return 2 * Math.PI * r * (h + r);
    }

    @Override
    public double calVolume() {
        return Math.PI * Math.pow(r, 2) * h;
    }

    @Override
    public String getName() {
        return "Cylinder";
    }
}
