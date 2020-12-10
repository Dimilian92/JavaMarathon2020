package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane myPlane = new Airplane("Boing", 2000, 156, 2123);
        myPlane.setYear(1997);
        myPlane.setLength(200);
        myPlane.fillUp(50);
        myPlane.fillUp(1000);
        myPlane.info();
    }
}
