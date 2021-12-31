public class Rectangle implements Shape {

    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public int getId() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public double getArea() {
        return this.width * this.height;
    }
}