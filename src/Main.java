public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Passwords...");
        System.out.println("");

        System.out.println("Strong Passwords results: ");
        Password validStrongPassword = new StrongPassword("validPassword1!");
        Password invalidStrongPassword = new StrongPassword("invalidPassword");
        System.out.println();

        System.out.println("Weak Passwords results: ");
        Password validWeakPassword = new WeakPassword("validpassword1");
        Password invalidWeakPassword = new WeakPassword("invalidpassword");
        System.out.println();

        System.out.println("Intermediate Passwords results: ");
        Password validIntermediatePassword = new IntermediatePassword("validPassword1");
        Password invalidIntermediatePassword = new IntermediatePassword("invalidpassword1");

        System.out.println();
        System.out.println("Testing Geometric Figures...");
        System.out.println("");

        GeometricFigure figure1 = new Circle(2.5);
        GeometricFigure figure2 = new Triangle(7.5, 8.4);
        GeometricFigure figure3 = new Rectangle(85.5, 7.6);

        System.out.println("Area of the figure 1: " + figure1.area());
        System.out.println("Area of the figure 2: " + figure2.area());
        System.out.println("Area of the figure 3: " + figure3.area());

        GeometricFigure arr[] = {figure1, figure2, figure3};
        System.out.println("The average area of the figures  is: " + GeometricFigureUtil.averageArea(arr));
    }
}
