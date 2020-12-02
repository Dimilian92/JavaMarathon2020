package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
            Scanner s = new Scanner (System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            int c = b-a;
            if(a>=b){
                System.out.println("Некорректный ввод");
            }
            else {
                while (c!=0){
                    if((b-c)%5==0 && (b-c)%10!=0){
                        System.out.print((b-c)+" ");
                    }
                    c--;
                }
            }
    }
}
