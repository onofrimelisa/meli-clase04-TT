public class Circle extends GeometricFigure{
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
}
