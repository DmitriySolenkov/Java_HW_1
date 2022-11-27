import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in, "cp866");
        int num1 = scanner.nextInt();
        System.out.println("Введите код операции: \n1: +\n2: -\n3: *\n4:/\n");
        int action = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = 0;
        float num3 = 0;
        if (action == 4) {
            num3 = scanner.nextFloat();
        } else {
            num2 = scanner.nextInt();
        }
        scanner.close();
        float res = 0;
        switch (action) {
            case 1:
                res = num1 + num2;
                break;
            case 2:
                res = num1 - num2;
                break;
            case 3:
                res = num1 * num2;
                break;
            case 4:
                res = num1 / num3;
                break;
            default:
                System.out.println("Вы выбрали неверный код операции, перезапустите программу");
                break;
        }

        System.out.format("Ответ: %.3g", res);
    }
}
