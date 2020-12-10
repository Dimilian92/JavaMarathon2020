package day6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        Car myCar = new Car();
        myCar.setColor("Orange");
        myCar.setYear(2020);
        myCar.setModel("Delorian");
        Motorbike myBike = new Motorbike(1997, "Pink", "Yamaha x7");

        myCar.info();
        System.out.println(myCar.getYear());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getModel());
        System.out.println(myCar.yearDifference(year));
        myBike.info();
        System.out.println(myBike.getYear());
        System.out.println(myBike.getColor());
        System.out.println(myBike.getModel());
        System.out.println(myBike.yearDifference(year));

    }
}
