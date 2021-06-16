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


}
