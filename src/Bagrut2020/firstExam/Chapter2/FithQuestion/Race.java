package Bagrut2020.firstExam.Chapter2.FithQuestion;

import java.util.ArrayList;

public class Race {
    public static void main(String[] args) {

        Competitor x = new Competitor(1,1,"x");
        Competitor y= new Competitor(2,1,"y");
        Competitor z = new Competitor(1,3,"z");
        Competitor d = new Competitor(11,1,"d");
        Competitor f= new Competitor(3,1,"f");
        Competitor g = new Competitor(4,3,"g");
        Race xd = new Race();

        xd.add(d);
        xd.add(f);
        xd.add(g);
        xd.add(x);
        xd.add(y);
        xd.add(z);

        for(int i = 0; i < xd.getComps().size(); i++ ){
            System.out.println(i+" "+xd.getComps().get(i).getName());
        }

        System.out.println(xd.rank(3));
        System.out.println(xd.rank(1));

    }
    ArrayList<Competitor> comps = new ArrayList<>();

    public Race() {

    }

    public ArrayList<Competitor> getComps() {
        return comps;
    }

    public void add(Competitor x) {

        if (this.comps.isEmpty()) {
            this.comps.add(x);

        } else {

            for (Competitor z : this.comps) {

                if (z.isBfr(x)) {
                    this.comps.add(this.comps.indexOf(z), x);
                }else if(!this.comps.iterator().next().isBfr(x)){
                    this.comps.add(this.comps.indexOf(z)+1, x);

                }
                return;

            }

        }
    }
    public String rank(int x){
        return this.comps.get(x-1).getName();

    }


}
