package Bagrut2018.Chapter1;

public class AllNumbers {

    private int[] array = { 7, 5, 8, 9, 3, 4};

    public int lastOddValue(){
        int lastOddValue = 0;

        for (int j : this.array) // == for(int i = 0; i < this.array.length; i++)
            if (j % 2 == 1) // == if(this.array[i] % 2 == 1)
                lastOddValue = j; // == lastOddValue = this.array[i]

        return lastOddValue;
    }

    //To test the code:
    public static void main(String[] args) {

        AllNumbers a = new AllNumbers();

        System.out.println(a.lastOddValue());
    }
}
