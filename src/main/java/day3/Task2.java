package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       while (true) {
           double divaiden = s.nextDouble();
           double divaider = s.nextDouble();
       if(divaider==0){
           break;
       }
           System.out.println(divaiden/divaider);
       }
    }
}
