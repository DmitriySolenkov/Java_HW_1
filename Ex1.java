import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Введите число N: ");
        Scanner scanner = new Scanner(System.in, "cp866");
        int num = scanner.nextInt();
        scanner.close();
        int sum = 0;
        int mult = 1;

        for (int index = 1; index <= num; index++) {
            sum = sum + index;
            mult = mult * index;
        }
        System.out.format("Треугольное число N: %d, факториал N: %d", sum, mult);
    }
}
