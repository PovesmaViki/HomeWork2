package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите количество элементов в массиве");
            int N = Integer.parseInt(reader.readLine());
            int[] numbers = new int[N];
            System.out.println("Заполните массив целыми числами");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(reader.readLine());
                if (numbers[i] % 2 == 0) ;
                {
                    System.out.println(numbers[i] + " - четное число");
                }
            }

        } catch (IOException e) {

        }
    }
}