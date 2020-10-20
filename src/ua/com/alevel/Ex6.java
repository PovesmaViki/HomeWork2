package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите колличество элементов массива");
            int N = Integer.parseInt(reader.readLine());
            int[] numbers = new int[N];
            System.out.println("Заполните массив целыми числами");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(reader.readLine());

            }
            if (N % 2 == 0) {
                for (int i = 0; i < numbers.length; i += 2) {
                    int n = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = n;
                }
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println("numbers = " + numbers[i]);
                }
            } else {
                for (int i = 0; i < numbers.length - 1; i += 2) {
                    int n = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = n;
                }
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println("numbers = " + numbers[i]);
                }
            }
        } catch (IOException e) {
        }
    }
}
