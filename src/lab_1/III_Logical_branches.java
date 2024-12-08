package lab_1;

public class III_Logical_branches {
        public static void main(String[] args) {
            if (args.length == 1) {
                try {
                    double x = Double.parseDouble(args[0]);
                    double Y, F;

                    // Вычисление Y
                    if (x <= 0) {
                        Y = 1 - Math.pow(9, x + 1);
                    } else if (x > 0 && x <= 3) {
                        Y = 1 + Math.pow(3, x);
                    } else {
                        Y = 1 / Math.tan(2 * x + 1);
                    }

                    // Вычисление F
                    if (x <= 0) {
                        F = Math.exp(Math.tan(2 * x + 1));
                    } else if (x > 0 && x <= 3) {
                        F = Math.pow(x, 2) - Math.pow(Math.sin(x), 4);
                    } else {
                        F = Math.sqrt(x);
                    }

                    System.out.println("Y = " + Y);
                    System.out.println("F = " + F);
                } catch (NumberFormatException e) {
                    System.out.println("Параметр должен быть числом");
                }
            } else {
                System.out.println("Неверное количество параметров");
            }
        }
    }
