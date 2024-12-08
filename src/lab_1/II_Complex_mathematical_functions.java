package lab_1;

public class II_Complex_mathematical_functions {
    public static void main(String[] args) {
        if (args.length == 2) {
            try {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);

                double max = Math.max(a, b);
                double min = Math.min(a, b);

                double numerator = max - 2 * min;
                double denominator = Math.sin(2) + (max / min);

                if (denominator != 0) {
                    double d = numerator / denominator;
                    System.out.println("Результат: d = " + d);
                } else {
                    System.out.println("Деление на ноль невозможно");
                }
            } catch (NumberFormatException e) {
                System.out.println("Параметры должны быть числами");
            }
        } else {
            System.out.println("Неверное количество параметров");
        }
    }
}
