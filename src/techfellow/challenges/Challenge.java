package techfellow.challenges;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Challenge {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputNumbers = input.split(" ");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers.add(Integer.parseInt(inputNumbers[i]));
        }

        int sum = 0;
        int fatorial = 1;
        for (int j = 0; j < numbers.get(0); j++) {
            int number = numbers.get(j+1);
            while(number >= 1) {
                fatorial *= number;
                number--;
            }
            sum += fatorial;
            fatorial = 1;
        }

        System.out.print(sum);
    }

    public void run2(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputNumbers = input.split(" ");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers.add(Integer.parseInt(inputNumbers[i]));
        }

        int movements = 0;
        int startX = numbers.get(0);
        int startY = numbers.get(1);
        int endX = numbers.get(2);
        int endY = numbers.get(3);

        int differenceX = startX - endX;
        int differenceY = startY - endY;
        differenceX = differenceX < 0 ? differenceX * -1 : differenceX;
        differenceY = differenceY < 0 ? differenceY * -1 : differenceY;

        if ((differenceY != 0 && differenceX != 0) && differenceX/differenceY == 1){
            System.out.print(movements + 1);
        } else if ((differenceY != 0 && differenceX != 0) && differenceX/differenceY != 1){
            System.out.print(movements + 2);
        } else {
            System.out.print(movements);
        }
    }

    public void run3(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputNumbers = input.split(" ");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers.add(Integer.parseInt(inputNumbers[i]));
        }

        int counter = 0;
        int xorResult = numbers.get(0) ^ numbers.get(1);

        while (xorResult > 0) {
            if ((xorResult & 1) == 1) {
                counter++;
            }
            xorResult >>= 1;
        }

        System.out.print(counter);
    }
}
