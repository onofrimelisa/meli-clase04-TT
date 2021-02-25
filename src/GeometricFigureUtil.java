public class GeometricFigureUtil {
    public static double averageArea (GeometricFigure arr[]) {
        double sum = 0;
        for (GeometricFigure figure :
                arr) {
            sum += figure.area();
        }
        return sum / arr.length;
    }
}
