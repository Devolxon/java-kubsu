package lab_1;

public class passwordcheck {
    public static void main(String[] args) {
        final String correctUsername = "user12";
        final String correctPassword = "password122";

        if (args.length == 2) {
            String username = args[0];
            String password = args[1];

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Вас узнали. Добро пожаловать");
            } else {
                System.out.println("Логин и пароль не распознаны. Доступ запрещен");
            }
        } else {
            System.out.println("Неверное количество параметров");
        }
    }
}
