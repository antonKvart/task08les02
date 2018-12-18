package ua.hillel.kvartalnyi.lesson02.task08;

public class Task08 {

    public static void main(String[] args) {
        int[] mas = {90, 0, 9, 9, 5, 3, 6, 8, 7, 33, -34};
        int max = mas[0];
        int min = mas[0];
        int sum;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        sum = max + min;
        System.out.println(sum);
    }
}
