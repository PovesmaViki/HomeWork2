package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите колличество элементов массива");
            int N = Integer.parseInt(reader.readLine());
            int[] numbers = new int[N + 1];
            System.out.println("Заполните массив целыми числами");
            int count = 0;
            for (int i = 1; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(reader.readLine());
                if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
                    count++;
                }
            }
            System.out.println(count - 1);
        } catch (IOException e) {

        }
    }
}