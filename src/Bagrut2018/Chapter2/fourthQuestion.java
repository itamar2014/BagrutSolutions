package Bagrut2018.Chapter2;

import java.util.Stack;

public class fourthQuestion {
    public fourthQuestion() {
    }

    public int lastAndRemove(Stack<Integer> stk){

        int last;
        last = stk.get(stk.size()-1);
        stk.remove((Integer) last);

        return last;
    }
    public static void main(String[] args){

        fourthQuestion f = new fourthQuestion();

        Stack<Integer> stk = new Stack<>();
        stk.add(1);
        stk.add(6);
        stk.add(32);
        stk.add(5);
        stk.add(7);
        stk.add(4);
        stk.add(9);

        System.out.println(f.lastAndRemove(stk) + "\n");

    }

}
