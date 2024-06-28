package gr.aueb.cf.ch16_17;

import java.io.Serializable;
import java.util.Objects;

public class Line extends AbstractShape implements ILine, Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private double length;

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }

    public Line(Line line) {
        this.length = line.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Double.compare(line.length, length) == 0;
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }
}
