package lab_1;

public class I_Variables {
    public static void main(String[] args) {
        if (args.length == 2) {
            try {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double sum = a + b;

                if (sum > 100) {
                    double result = 2 * Math.sin(a);
                    System.out.println("Удвоенный синус первого числа: " + result);
                } else {
                    System.out.println("Сумма чисел меньше или равна 100");
                }
            } catch (NumberFormatException e) {
                System.out.println("Оба параметра должны быть числами");
            }
        } else {
            System.out.println("Неверное количество параметров");
        }
    }
}

