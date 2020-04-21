import java.util.Arrays;
import java.util.Scanner;

public class final2 {

    public static void main(String[] args) {
        int temp, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int x = in.nextInt();
        int sample[] = new int[x];
        int length = sample.length;
        for (int i = 0; i < length; i++) {
            System.out.print("Введите значения: ");
            sample[i] = in.nextInt();
        }
        for (int i = 0; i < sample.length - 1; i++) {
            if (sample[i] > sample[i + 1]) {
                temp = sample[i + 1];
                sample[i + 1] = sample[i];
                   j = i;
                   while (j > 0 && temp < sample[j - 1]) {
                       sample[j] = sample[j - 1];
                       j--;
                   }
                   sample[j] = temp;
                }
            }
            System.out.print("Вывод " + Arrays.toString(sample));
    }
}
