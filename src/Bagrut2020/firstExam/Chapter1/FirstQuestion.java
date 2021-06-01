package Bagrut2020.firstExam.Chapter1;

public class FirstQuestion {
     /*

    public static void main(String[] args) {
        int[] arr = {3,-2,6,2,1,3};

        System.out.println(above(arr,9));
    }

     */

    public static int above(int[] arr, int num){

        int sum = 0;

        for(int i = 0; i < arr.length -1; i++){

            if(sum<num) {
                sum += arr[i];

            } else {
                return i;
            }

        }
        return -1;
    }


}

