package gr.aueb.cf.ch16_17;

import java.io.Serializable;
import java.util.Objects;

public class Rectangle extends AbstractShape implements IRectangle, Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        this.height = rectangle.getHeight();
        this.width = rectangle.getWidth();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public long getCircumference() {
        return (long) (2 * width + 2 * height);
    }
}
