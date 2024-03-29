import java.util.Scanner;

public class AreasOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figureType = scanner.nextLine();
        double area = 0;

        switch (figureType) {
            case "square": {
                double a = Double.parseDouble(scanner.nextLine());
                area = a * a;
                break;
            }
            case "rectangle": {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                area = a * b;
                break;
            }
            case "circle": {
                double r = Double.parseDouble(scanner.nextLine());
                area = Math.PI * r * r;
                break;
            }
            case "triangle": {
                double a = Double.parseDouble(scanner.nextLine());
                double h = Double.parseDouble(scanner.nextLine());
                area = (a * h) / 2;
                break;
            }
        }
            System.out.printf("%.3f", area);
        }
    }


