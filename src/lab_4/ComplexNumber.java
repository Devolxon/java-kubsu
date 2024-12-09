package lab_4;

public class ComplexNumber {
    private double real;   // Действительная часть
    private double imaginary; // Мнимая часть

    // Конструктор
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Геттеры и сеттеры
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Метод для нахождения комплексно-сопряжённого числа
    public ComplexNumber conjugate() {
        return new ComplexNumber(this.real, -this.imaginary);
    }

    // Переопределение toString() для удобного отображения
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }

    // Точка входа для тестирования
    public static void main(String[] args) {
        ComplexNumber number = new ComplexNumber(3, 4);
        System.out.println("Original number: " + number);

        ComplexNumber conjugate = number.conjugate();
        System.out.println("Conjugate number: " + conjugate);
    }
}