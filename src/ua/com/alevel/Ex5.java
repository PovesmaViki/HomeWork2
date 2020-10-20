package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите колличество элементов массива");
            int N = Integer.parseInt(reader.readLine());
            int[] numbers = new int[N + 1];
            System.out.println("Заполните массив целыми числами");
            for (int i = 1; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(reader.readLine());
            }
            for (int i = numbers.length - 1; i >= 1; i--) {
                int[] NUM = numbers;
                System.out.print(numbers[i] + " ");
            }
        } catch (IOException e) {
        }
    }
}