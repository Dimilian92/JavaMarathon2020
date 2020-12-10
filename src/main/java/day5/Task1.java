package day5;

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setColor("Blue");
        myCar.setModel("K5");
        myCar.setYear(2020);
        System.out.println(myCar.getColor());
        System.out.println(myCar.getModel());
        System.out.println(myCar.getYear());
    }

    static class Car {
        private int year;
        private String color;
        private String model;

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }
}
