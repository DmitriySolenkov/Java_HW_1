public class Ex2 {
    public static void main(String[] args) {
        int num = 1;
        System.out.format("%d ", num);
        for (num = 2; num <= 1000; num++) {
            int index = 2;
            while (index <= num) {
                if (index == num) {
                    System.out.format("%d ", num);
                    index = 1;
                }
                if (num % index == 0) {
                    break;
                } else {
                    index++;
                }

            }
        }
    }
}
