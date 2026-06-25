

public class Main {

   )
    public interface Shape {
        double calculateArea();
    }

   
    public static class Rectangle implements Shape {
        private final double length;
        private final double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    
    public static class Circle implements Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * (radius * radius);
        }
    }

    
    public static class Triangle implements Shape {
        private final double base;
        private final double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return 0.5 * base * height;
        }
    }


    public static class AreaCalculator {
        public double calculateTotalArea(Shape[] shapes) {
            double area = 0;
            for (Shape shape : shapes) {
                area += shape.calculateArea(); 
            }
            return area;
        }
    }

    // 6. Main Method to Test the Code
    public static void MAin2(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Shape[] shapes = new Shape[] {
            new Rectangle(5, 4),      
            new Circle(3),            
            new Triangle(6, 4)        
        };

        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.printf("Total Area of all shapes: %.2f\n", totalArea);
    }
}
