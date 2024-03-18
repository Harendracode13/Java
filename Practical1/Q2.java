/*
 . Write a program that solves the following equation and displays the value x and y:
a) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9 (Assume Cramer‘s rule to solve equation
b) ax+by=e x=ed-bf/ad-bc cx+dy=f y=af-ec/ad-bc )

 */
public class Q2 {
    public static void main(String[] args) {
        // Coefficients of the equations
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        // Calculate the determinant
        double determinant = a * d - b * c;

        // Check if the determinant is zero (no unique solution)
        if (determinant == 0) {
            System.out.println("The system of equations has no unique solution.");
        } else {
            // Calculate x and y using Cramer's rule
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;

            // Display the values of x and y
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
