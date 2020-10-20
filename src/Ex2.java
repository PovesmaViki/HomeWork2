package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите колличество элементов в массиве");
            int N = Integer.parseInt(reader.readLine());
            int[] numbers = new int[N];
            int count = 0;
            System.out.println("Заполните массив целыми числами");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(reader.readLine());
                if (numbers[i] > 0) {
                    count++;
                }
            }
            System.out.println(count);

        } catch (IOException e){

        }
    }
}