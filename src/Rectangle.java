public class Rectangle {
    private double width;
    private double length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        }else{
            throw new IllegalArgumentException("Value must be positive!");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        }else{
            throw new IllegalArgumentException("Value must be positive!");
        }
    }

    public void getPerimeter(){
        System.out.printf("Perimeter of given Rectangle = %.2f \n", (2*(width+length)));
    }

    public void getArea(){
        System.out.printf("Area of given Rectangle = %.2f \n", (width*length));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
