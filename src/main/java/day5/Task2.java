package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike myBike = new Motorbike(1997, "black", "Chopper");
        System.out.println(myBike.getYear());
        System.out.println(myBike.getColor());
        System.out.println(myBike.getModel());
    }

    static class Motorbike {
        private int year;
        private String color;
        private String model;

        public Motorbike(int year, String color, String model) {
            this.year = year;
            this.color = color;
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public String getColor() {
            return color;
        }

        public String getModel() {
            return model;
        }
    }
}
