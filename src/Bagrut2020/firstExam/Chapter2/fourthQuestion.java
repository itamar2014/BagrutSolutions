package Bagrut2020.firstExam.Chapter2;

import java.util.ArrayList;
import java.util.Stack;

public class fourthQuestion {

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(122);
        stk.push(251);
        stk.push(565);
        stk.push(12334);
        stk.push(28);
        stk.push(7);

        System.out.println(allExist(stk));
    }

    public static boolean isExist(Stack<Integer> stk, int num){
        boolean isExist = false;

        Stack<Integer> stkC = (Stack<Integer>) stk.clone();

        while( !stkC.isEmpty() && !isExist){
            if(stkC.pop() % 10 == num)
                isExist = true;
        }

        return isExist;
    }

    public static boolean allExist(Stack<Integer> stk){

        boolean allExist = false;
        int num;
        Stack<Integer> stkC = (Stack<Integer>) stk.clone();

        while( !stkC.isEmpty()){
            allExist = isExist(stk, fdi(stkC.pop()));

            if(!allExist)
                return false;
        }

        return allExist;
    }

    public static int fdi(int num){
        while ( num >= 10)
            num /= 10;
        return num;

    }


}
