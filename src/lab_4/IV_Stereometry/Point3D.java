package lab_4.IV_Stereometry;

class Point3D extends Point {
    private int z;

    // Конструктор по умолчанию
    public Point3D() {
        super();  // Вызов конструктора родительского класса
        this.z = 0;
    }

    // Конструктор с параметрами
    public Point3D(int x, int y, int z) {
        super(x, y);  // Вызов конструктора родительского класса
        this.z = z;
    }

    // Геттер для Z
    public int getZ() {
        return z;
    }

    // Метод для нахождения скалярного произведения двух векторов в 3D
    public static int scalarProduct(Point3D p1, Point3D p2) {
        return p1.getX() * p2.getX() + p1.getY() * p2.getY() + p1.getZ() * p2.getZ();
    }

    // Метод toString() для вывода точки в трехмерном пространстве
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}