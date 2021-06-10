package Bagrut2020.firstExam.Chapter1;

public class Weight {

    public int kilo;
    public int gram;

    //Getters
    public int getKilo() {
        return kilo;
    }

    public int getGram() {
        return gram;
    }

    //Setters
    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    //Constructors

    //A
    public Weight() { }

    //B
    public Weight(int kilo, int gram) {
        this.kilo = kilo;
        this.gram = gram;
    }

    //C
    public Weight(int totalGram) {
        this.kilo = totalGram / 1000;
        this.gram = totalGram % 1000;
    }

    public void add(Weight other) {

        this.gram += other.getGram();

        this.kilo += other.getKilo();
        if (this.getGram() >= 1000) {
            this.kilo += this.getGram() / 1000;

            this.gram = this.getGram() % 1000;
        }

    }

    public boolean less(Weight other) {

        boolean size;

        size = this.getKilo() < other.getKilo();

        if (this.getKilo() == other.getKilo()) {
            size = this.getGram() < other.getGram();

        }
        return size;
    }

    public static class AllWeights {

        //Example weights
        Weight weight1 = new Weight(5,0);
        Weight weight2 = new Weight(5,0);
        Weight weight3 = new Weight(5,0);

        Weight[] arr = {weight1, weight2, weight3};

        public Weight sum(){
            Weight sum = new Weight();

            /*
            for(int i = 0; i< arr.length; i++){
                sum.add(arr[i]);
            }
             */

            for( Weight i : arr)
                sum.add(i);


            return sum;
        }
    }

    public static void main(String[] args) {

        Weight weight = new Weight(3999);
        System.out.println( "K: " + weight.getKilo() + " \nG: "+ weight.getGram());

    }
}
