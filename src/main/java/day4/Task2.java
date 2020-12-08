package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int bigest = 0;
        int smallest = 0;
        int endsWhithZero = 0;
        int sumOfZeroEnd = 0;
        for(int i = 0; i<100; i++){
            arr[i] = (int)(Math.random()*10000);

            if(i==0){
                bigest =arr[i];
                smallest =arr[i];
            } else {
                if(arr[i]>bigest) {
                    bigest = arr[i];
                }
                if(arr[i]<smallest){
                    smallest = arr[i];
                }
            }


        }

    }
}
