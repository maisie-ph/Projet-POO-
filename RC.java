package GameQR;

public class RC
{
    private String question;
    private static String reponse;
    private static String proposition;

    public RC(String question, String reponse, String proposition)
    {
        this.question = question;
        this.reponse = reponse;
        this.proposition = proposition;
    }

    public String getReponse() {
        return reponse;
    }

    public String getQuestion() {
        return question;
    }

    public String getProposition() {
        return proposition;
    }

    public static boolean ReponseCorrect(String niveau)
    {
        if(reponse == proposition)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {

    }
}
