import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        {
            /*random & ПЕРВЫЙ ТАСК*/

            Random random = new Random();
            int mach = 0;
            int[] day = new int[30];

            for (int i = 0; i <= (day.length - 1); i++) {
                int num = random.nextInt(100_000) + 100_000;
                mach = mach + num;
                day[i] = num;
            }

            System.out.printf("Сумма трат за месяц составила %s рублей", mach);
            System.out.println();
            System.out.println();



            /*ВТОРОЙ ТАСК*/

            int max = 0;
            int min = day[0];

            for (int i = 0; i < day.length; i++) {
                if (day[i] > max) {
                    max = day[i];
                }

                if (day[i] < min) {
                    min = day[i];
                }
            }
            System.out.printf("Минимальная сумма за месяц %s рублей. Максимальная сумма за месяц %s рублей.", min, max);
            System.out.println();



            /*Т3РЕ3ТИЙ ТАС3К*/

            System.out.printf("Среднее значение трат за месяц состовляет %.0f рублей.", (mach / (day.length)));
            System.out.println();
            System.out.println();



            /*ЧЕТВЁРТ4ЫЙ ТАСК*/

            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }
    }
}