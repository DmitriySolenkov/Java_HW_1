// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//  Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

// Для примера взял выражение ?7+?1=78
public class Ex4 {
    public static void main(String[] args) {
        boolean boo = false;
        for (int index1 = 0; index1 <= 9; index1++) {
            for (int index2 = 0; index2 <= 9; index2++) {
                if (index1 * 10 + 7 + index2 * 10 + 1 == 78)
                    System.out.format("Решение: %d7 + %d1 = 78\n", index1, index2);
                boo = true;
            }
        }
        if (boo == false) {
            System.out.println("Решений нет!");
        }
    }
}
