import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lunghezza rettangolo: ");
        double width = scanner.nextDouble();

        System.out.println("Altezza rettangolo: ");
        double heigth = scanner.nextDouble();

        double result = perimeter(width, heigth);
        System.out.println("Il perimetro è: " + result);

        scanner.close();
    }

    public static double perimeter(double width, double heigth) {
        return 2 * (width + heigth);
    }
}
