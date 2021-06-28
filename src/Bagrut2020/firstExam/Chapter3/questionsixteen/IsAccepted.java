package Bagrut2020.firstExam.Chapter3.questionsixteen;

public class IsAccepted {


    public static boolean isAccepted(Object[] arr){
        boolean isAccepted = false;

        int upVote = 0;
        int downVote = 0;

        for(Object o : arr){
            Employee epl = (Employee) o;
            if(epl instanceof Supervisor || epl instanceof UnionMember)
                downVote+=epl.GetScore();
            upVote+=epl.GetScore();

            }

        return upVote>downVote;
    }


}

