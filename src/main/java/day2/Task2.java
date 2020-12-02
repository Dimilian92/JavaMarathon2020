package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = b-a;
    if(a>=b){
        System.out.println("Некорректный ввод");
    }
    else {
        for(int i = 0 ; i < c; i++){
            if((a+i)%5==0 && (a+i)%10!=0){
                System.out.print((a+i)+" ");
            }
        }
    }
    }
}
