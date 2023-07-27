
  /*  user_uuid_a
            id,user_id, uuid, status, created_on
    user_uuid_b
            id,user_id, uuid, status, created_on
    user
            user_id, username, mobile
    Fetch all the users (username and mobile) whose uuid are different in above tables

    Select username, mobile form user where uuid not in ( select distinct uuid from user_uuid_a a join user_uuid_b b on a.user_id = b.user_id )


    Given: */
  public class InterviewQuestions {
      public static void main(String[] args) {
            String s = "-";
            Integer x = 343;
            long L343 = 343L;
            if(x.equals(L343)) s += ".e1 ";
            if(x.equals(343)) s += ".e2 ";
            Short s1 = (short)((new Short((short)343)) / (new Short((short)49)));
            if(s1 == 7) s += "=s ";
            if(s1 < new Integer(7+1)) s += "fly ";
            System.out.println(s);
        }
    }
/*
    Which of the following will be included in the output String s? (Choose all that apply.)
    A. .e1
    B. .e2
    C. =s
    D. fly
    E. None of the above
    F. Compilation fails
    G. An exception is thrown at runtime*/
