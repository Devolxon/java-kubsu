package lab_4.III_geometry;

class Point {
    private int x;
    private int y;

    // Конструктор по умолчанию
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Конструктор с параметрами
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Установка новых координат
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Метод toString()
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Расстояние от начала координат
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Проверка, находится ли точка в прямоугольной области
    public boolean isInRectangle(Point top_left, Point bottom_right) {
        return x >= top_left.getX() && x <= bottom_right.getX() &&
                y >= top_left.getY() && y <= bottom_right.getY();
    }

    // Проверка, находится ли точка в окружности
    public boolean isInCircle(Point center, double radius) {
        double distance = Math.sqrt(Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2));
        return distance <= radius;
    }
}