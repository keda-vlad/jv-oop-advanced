package core.basesyntax.model.figure;

import core.basesyntax.model.Color;
import core.basesyntax.model.Drawable;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(Color color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        String area = Drawable.doubleToString(area());
        String status = new StringBuilder()
                .append("Figure: rectangle, area: ")
                .append(area)
                .append(" sq.units, width: ")
                .append(width)
                .append(" units, height: ")
                .append(height)
                .append(" units, color: ")
                .append(this.color).toString();
        System.out.println(status);
    }

    @Override
    public double area() {
        return width * height;
    }
}