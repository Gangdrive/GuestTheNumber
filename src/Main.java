import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 10;
        int count = 0;
        int countMax = 3;
        int numberComputer = random.nextInt(max - min + 1) + min;

        System.out.println("\nДобро пожаловать в игру 'Угадай число' ");
        System.out.println("Мы загадали число от " + min + " до " + max + ". У вас " + countMax + " попытки.");
        System.out.println("Игра началась!");

        do {
            System.out.println("\nУгадайте число:");

            int numberUser = scanner.nextInt();

            if (numberUser == numberComputer) {
                count++;
                System.out.println("Использовано попыток: " + count + " из " + countMax);
                System.out.println("Вы выиграли!");
                break;
            } else if (numberUser > numberComputer) {
                count++;
                System.out.println("Использовано попыток: " + count + " из " + countMax);
                System.out.println("Загаданное число меньше!");
            } else {
                count++;
                System.out.println("Использовано попыток: " + count + " из " + countMax);
                System.out.println("Загаданное число больше!");
            }

            if (count == countMax) {
                System.out.println("\nУ вас закончились попытки :(\nВы проиграли!");
                System.out.println("Загаданное число: " + numberComputer);
            }

        }
        while (count < 3);
    }
}
