import java.util.*;

import static java.lang.Math.floorDiv;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }


    public static void task1() {
        Scanner in = new Scanner(System.in);

        int enter, devisble, remain, count = 0, sum = 0;
        int[] numbers = new int[0];

        System.out.println("Введите целое положительное число");

        enter = in.nextInt();

        if (enter > 0) {

            devisble = enter;

            while (devisble != 0) {
                remain = devisble % 10;
                numbers = Arrays.copyOf(numbers, numbers.length + 1);
                numbers[numbers.length -1] = remain;
                devisble /= 10;
                count++;
            }
        }

        for (int number : numbers) {
            sum += (int) pow(number, count);
        }

        if (enter == sum) {
            System.out.println("Это число Армстронга");
        } else {
            System.out.println("Это не число Армстронга");
        }
    }


    public static void task2() {

        List<String> names = new ArrayList<>();
        names.add("Анна");
        names.add("Михаил");
        names.add("Игорь");
        names.add("Ирина");

        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).substring(1));
        }

        Collections.sort(names);

        System.out.println(names);

    }
}