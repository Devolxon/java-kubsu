package lab_4.III_geometry;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты Point и Point3D
        Point point2D = new Point(3, 4);
        Point3D point3D = new Point3D(3, 4, 5);

        // Тестируем методы Point
        System.out.println("2D Point: " + point2D);
        System.out.println("Distance from origin (2D): " + point2D.distanceFromOrigin());

        // Тестируем методы Point3D
        System.out.println("3D Point: " + point3D);
        System.out.println("Distance from origin (3D): " + point3D.distanceFromOrigin());

        // Тестируем метод isInBox
        Point3D boxCorner1 = new Point3D(0, 0, 0);
        Point3D boxCorner2 = new Point3D(5, 5, 5);
        System.out.println("Point is in box: " + point3D.isInBox(boxCorner1, boxCorner2));

        // Тестируем метод isInSphere
        Point3D sphereCenter = new Point3D(0, 0, 0);
        double radius = 6.0;
        System.out.println("Point is in sphere: " + point3D.isInSphere(sphereCenter, radius));
    }
}