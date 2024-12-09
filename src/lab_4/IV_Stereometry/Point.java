package lab_4.IV_Stereometry;

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

    // Геттеры и сеттеры
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Метод для нахождения скалярного произведения двух векторов в 2D
    public static int scalarProduct(Point p1, Point p2) {
        return p1.getX() * p2.getX() + p1.getY() * p2.getY();
    }

    // Метод toString()
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}