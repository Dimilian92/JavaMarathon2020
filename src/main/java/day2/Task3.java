package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
            Scanner s = new Scanner (System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            if(a>=b){
                System.out.println("Некорректный ввод");
            }
            else {
                int i = a;
                while (i <=b){
                    if(i%5==0 && i%10!=0){
                        System.out.print(i+" ");
                    }
                    i++;
                }
            }
    }
}
