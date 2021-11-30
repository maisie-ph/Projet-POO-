package GameQR;

public class QCM
{
    private String question;
    public static String [] proposition = new String[3];
    private String reponse;

    public QCM(String[] proposition, String question, String reponse)
    {
        this.proposition = proposition;
        this.question = question;
        this.reponse = reponse;
    }

    public String getQuestion() {
        return question;
    }

    public String getReponse() {
        return reponse;
    }

    public String [] getProposition() {return proposition;}

    public static boolean BonneReponse(String réponse, String niveau)
    {
        for(int i=0; i < proposition.length; i++){
            if(proposition[i] == réponse){
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }


    public static void main(String[] args)
    {

    }

}
