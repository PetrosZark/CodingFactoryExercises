package gr.aueb.cf.ch16_17;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ICircle, Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString();
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }

    @Override
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public long getCircumference() {
        return (long) (2 * Math.PI * radius);
    }
}
