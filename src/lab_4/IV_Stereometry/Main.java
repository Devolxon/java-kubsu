package lab_4.IV_Stereometry;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты Point и Point3D
        Point p1 = new Point(3, 4);
        Point p2 = new Point(1, 2);

        // Тестируем скалярное произведение в 2D
        int scalarProduct2D = Point.scalarProduct(p1, p2);
        System.out.println("Скалярное произведение (2D): " + scalarProduct2D);

        // Создаем объекты Point3D
        Point3D p3 = new Point3D(3, 4, 5);
        Point3D p4 = new Point3D(1, 2, 3);

        // Тестируем скалярное произведение в 3D
        int scalarProduct3D = Point3D.scalarProduct(p3, p4);
        System.out.println("Скалярное произведение (3D): " + scalarProduct3D);
    }
}