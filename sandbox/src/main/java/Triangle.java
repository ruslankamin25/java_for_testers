public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double sideA, double sideB, double sideC) {
        a = sideA;
        b = sideB;
        c = sideC;
    }

    public double getPerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }
    public double getArea() {
        double p = getPerimeter() / 2;


        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }
        public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3, 4, 5);

            System.out.println("Периметр: " + triangle1.getPerimeter());
            System.out.println("Площадь: " + triangle1.getArea());

        }


    }

