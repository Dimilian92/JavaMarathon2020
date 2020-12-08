package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int arr [] = new int[length];
        int larger8 = 0;
        int equal1 = 0;
        int even = 0;
        int odd =0;
        int sum = 0;
        for(int i = 0; i < length; i++){
            arr[i] = (int)(Math.random()*10);
            if(arr[i]>8){
                larger8++;
            }
            if(arr[i]==1){
                equal1++;
            }
            if(arr[i]%2!=0){
              odd++;
            } else {
                even++;
            }
            sum=sum+arr[i];
        }
        System.out.println("Длина массива:"+length);
        System.out.println("Количество чисел больше 8:"+ larger8);
        System.out.println("Количество чисел равных 1:"+ equal1);
        System.out.println("Количество четных чисел:"+even);
        System.out.println("Количество нечетных чисел:"+odd);
        System.out.println("Сумма всех элементов массива:"+sum);

    }
}
