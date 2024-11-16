import java.util.Scanner;

public class Registration {
    public static void registerUser (String login, String password, String confirmPassword) throws IllegalArgumentException {
        // Проверка логина
        if (!isValidLogin(login)) {
            throw new IllegalArgumentException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания, и быть менее 15 символов.");
        }

        // Проверка пароля
        if (!isValidPassword(password)) {
            throw new IllegalArgumentException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания, и быть от 7 до 20 символов.");
        }

        // Проверка совпадения пароля и его подтверждения
        if (!password.equals(confirmPassword)) {
            throw new IllegalArgumentException("Пароль и подтверждение пароля не совпадают.");
        }

        // Если все проверки пройдены, можно продолжать регистрацию
        System.out.println("Пользователь успешно зарегистрирован!");
    }

    private static boolean isValidLogin(String login) {
        return login.matches("^[a-zA-Z0-9_]{1,14}$");
    }

    private static boolean isValidPassword(String password) {
        return password.matches("^[a-zA-Z0-9_]{7,20}$");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        System.out.print("Повторите пароль: ");
        String confirmPassword = scanner.nextLine();

        try {
            registerUser (login, password, confirmPassword);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            }
        }
    }