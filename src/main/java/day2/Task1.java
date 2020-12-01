package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String floors = s.nextLine();
        int floorsInt = Integer.parseInt(floors);
        if(floorsInt>=1 && floorsInt<=4){
            System.out.println("Малоэтажный дом");
        } else if (floorsInt>=5 && floorsInt<=8){
            System.out.println("Среднеэтажный дом");
        } else if (floorsInt>=9){
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
