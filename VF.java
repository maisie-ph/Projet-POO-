package GameQR;

public class VF
{
    private static String proposition;
    private String question;
    private static String réponse;

    public VF(String proposition, String question, String réponse)
    {
        this.proposition = proposition;
        this.question = question;
        this.réponse = réponse;
    }

    public String getQuestion() {
        return question;
    }

    public String getReponse() {
        return réponse;
    }

    public String getProposition(String proposition)
    {
        return proposition;
    }

    public static boolean VraiouFaux(String question, String niveau)
    {
        if(réponse == proposition)
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
