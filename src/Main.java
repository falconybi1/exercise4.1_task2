import java.util.Scanner;

class RectangleArea {
    private double width;
    private double height;
    private double area;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side a: ");
        width = scanner.nextDouble();
        System.out.print("Enter the length of side b: ");
        height = scanner.nextDouble();
    }
    public void computeField() {
        area = width * height;
    }
    public void fieldDisplay() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
    }
}
public class Main {
    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();
        rectangle.getData();
        rectangle.computeField();
        rectangle.fieldDisplay();
    }
}
