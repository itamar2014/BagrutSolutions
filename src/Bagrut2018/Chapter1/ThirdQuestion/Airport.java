package Bagrut2018.Chapter1.ThirdQuestion;

public class Airport {

    public Airport() {
    }

    Time t = new Time(1, 2);
    Flight f1 = new Flight("Cloud", "1", "123", t);
    Flight f2 = new Flight("Air", "1", "123", t);
    Flight f3 = new Flight("Sky", "1", "123", t);
    Flight f4 = new Flight("Travel", "1", "123", t);

    public Flight[] flights = {f1, f2, f3, f4};

    private boolean isFly() {
        boolean is = false;

        for (Flight i : flights) {

            if (i.getcName().equals("Sky")) {
                is = true;
                break;
            }

        }
        return is;

    }

}



