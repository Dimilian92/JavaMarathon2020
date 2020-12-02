package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5;i++) {
            double divaiden = s.nextDouble();
            double divaider = s.nextDouble();
            switch ((int) divaider){
                case 0:
                    System.out.println("Деление на 0");
                    break;
                default:
                    System.out.println(divaiden/divaider);
            }

        }
    }
}
