import java.util.Scanner;

public class SecondTask {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the value of a:");
            double a = scanner.nextDouble();

            System.out.println("Enter the value of b:");
            double b = scanner.nextDouble();

            System.out.println("Enter the value of c:");
            double c = scanner.nextDouble();

            solveQuadraticEquation(a, b, c);
        }

        public static void solveQuadraticEquation(double a, double b, double c) {
            double discriminant = b * b - 4 * a * c;

            /*
             * Тут я використав Math.sqrt замість Math.pow про який йшлося у завданні,
             * більше до нього просто звик, на автоматі його використав, та Math.sqrt
             * навіть більш оптимальний начебто ніш Math.pow, якщо не помиляюсь.
             */
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                System.out.println("Two different square roots:");
                System.out.println("Square root 1: " + root1);
                System.out.println("Square root 2: " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("One square root:");
                System.out.println("Square root: " + root);
            } else {
                System.out.println("The discriminant is less than zero, there are no solutions in the domain of real numbers.");
            }
        }
    }
