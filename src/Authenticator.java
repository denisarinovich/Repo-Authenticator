import static java.lang.System.*;
import java.util.Locale;
import javax.swing.*;

public class Authenticator {

    /*
    Вторая версия программы.
    Задачей данной программы является проверка логина и пароля пользователя и предоставление доступа к программному обеспечению.
    Раздельные проверки логина/пароля.
    */

    public static void main(String arqs[]) {

        String userDmitry = "Dmitry Kulikov";
        String userDmitryUC = userDmitry.toUpperCase(Locale.ROOT);
        String userNikita = "Nikita Zakharov";
        String userNikitaUC = userNikita.toUpperCase(Locale.ROOT);
        String userDenis = "Denis Arinovich";
        String userDenisUC = userDenis.toUpperCase(Locale.ROOT);

        String passwordDmitry = "Merida";
        String passwordDmitryUC = passwordDmitry.toUpperCase(Locale.ROOT);
        String passwordNikita = "Polygon";
        String passwordNikitaUC = passwordNikita.toUpperCase(Locale.ROOT);
        String passwordDenis = "Outleap";
        String passwordDenisUC = passwordDenis.toUpperCase(Locale.ROOT);

        boolean accessAllowder = false;
        boolean userFinder = false;
        boolean passwordFinder = false;

        String username = null;
        String password = null;

        while (!userFinder) {
            username = JOptionPane.showInputDialog(null, "Введите логин пользователя:", "your Name and Second name");

            if (username == null) {
                int confirm = JOptionPane.showConfirmDialog(null, "Вы хотите выйти из приложения?", "Выход из программы", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(1);
                }

            } else if ((username.equals(userDmitry) || username.equals(userDmitryUC)) ||
                    (username.equals(userNikita) || username.equals(userNikitaUC)) ||
                    (username.equals(userDenis) || username.equals(userDenisUC))) {

                JOptionPane.showMessageDialog(null, "Пользователь " + username + " найден!");
                userFinder = true;

            } else {
                JOptionPane.showMessageDialog(null, "Пользователь не найден, повторите попытку!");
            }
        }


        while (!passwordFinder) {
            password = JOptionPane.showInputDialog("Введите пароль пользователя " + username + ":", "the Brand of your two-wheeled horse");

            if (password == null) {
                int confirm = JOptionPane.showConfirmDialog(null, "Вы хотите выйти из приложения?", "Выход из программы", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(1);
                }
            } else if ((username.equals(userDmitry) || username.equals(userDmitryUC)) && (password.equals(passwordDmitry) || password.equals(passwordDmitryUC)) ||
                    (username.equals(userNikita) || username.equals(userNikitaUC)) && (password.equals(passwordNikita) || password.equals(passwordNikitaUC)) ||
                    (username.equals(userDenis) || username.equals(userDenisUC)) && (password.equals(passwordDenis) || password.equals(passwordDenisUC))) {

                JOptionPane.showMessageDialog(null, "Вы допущены в систему. Добро пожаловать!");
                passwordFinder = true;

            } else {
                JOptionPane.showMessageDialog(null, "Пароль не верен, в доступе отказано. Повторите попытку.");
            }
        }

        if (userFinder && passwordFinder) {
            accessAllowder = true;

        }
    }
}