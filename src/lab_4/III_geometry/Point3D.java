package lab_4.III_geometry;

class Point3D extends Point {
    private int z;

    // Конструктор по умолчанию
    public Point3D() {
        super();  // Вызов конструктора родительского класса Point (по умолчанию)
        this.z = 0;
    }

    // Конструктор с параметрами
    public Point3D(int x, int y, int z) {
        super(x, y);  // Вызов конструктора родительского класса Point с параметрами
        this.z = z;
    }

    // Установка новых координат (три параметра)
    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);  // Вызов метода установки координат родительского класса
        this.z = z;
    }

    // Переопределение setLocation для двух параметров
    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);  // Вызов метода установки координат родительского класса
        this.z = 0; // Координата Z обнуляется
    }

    // Геттер для Z
    public int getZ() {
        return z;
    }

    // Переопределение toString()
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    // Расстояние от начала координат с учетом Z
    @Override
    public double distanceFromOrigin() {
        return Math.sqrt(getX() * getX() + getY() * getY() + z * z);
    }

    // Проверка, находится ли точка в прямоугольном параллелепипеде
    public boolean isInBox(Point3D corner1, Point3D corner2) {
        return getX() >= Math.min(corner1.getX(), corner2.getX()) &&
                getX() <= Math.max(corner1.getX(), corner2.getX()) &&
                getY() >= Math.min(corner1.getY(), corner2.getY()) &&
                getY() <= Math.max(corner1.getY(), corner2.getY()) &&
                z >= Math.min(corner1.getZ(), corner2.getZ()) &&
                z <= Math.max(corner1.getZ(), corner2.getZ());
    }

    // Проверка, находится ли точка в сфере
    public boolean isInSphere(Point3D center, double radius) {
        double distance = Math.sqrt(Math.pow(getX() - center.getX(), 2) +
                Math.pow(getY() - center.getY(), 2) +
                Math.pow(z - center.getZ(), 2));
        return distance <= radius;
    }
}
