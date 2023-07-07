// Вычислить n-ое треугольное число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner iscanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        Integer n = iscanner.nextInt();
        Integer summ = 0;
        Integer factorial = 1;
        for (int i = 1; i <= n; i++) {
           summ = summ + i;
        }
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Треугольное число = " + summ);
        System.out.println("Факториал = " + factorial);
    }
}