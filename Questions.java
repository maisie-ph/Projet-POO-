package GameQR;

import java.util.LinkedList;
import java.util.Random;
import java.util.ArrayList;


public class Questions
{
    private String réponse;
    private String question;
    private String thème;
    private LinkedList<String> listQuestion;

    public Questions(String thème,String question, String réponse)
    {
        this.thème = thème;
        this.réponse = réponse;
        this.listQuestion = new LinkedList<>();
    }


    public LinkedList<String> getListQuestion(){return listQuestion;}

    public String getThème() {return thème;}

    public String getQuestion() {return question;}

    public String getRéponse() {return réponse;}

    public void addQuestion(String question)
    {
        listQuestion.add(question);
    }

    public void TabQuestions()
    {
        for(String question : listQuestion)
        {
            System.out.println(question);
        }
    }

    public void selectQuestion()
    {
        Random choix = new Random();
        int Monchoix = choix.nextInt(10)+1;

        for(int q=0; q<Monchoix; q++)
        {
            Random rq = new Random();
            int index = rq.nextInt(0,listQuestion.size());
            System.out.println(listQuestion.get(index));
        }
    }

    public String toString()
    {
        return "liste_question : { " + listQuestion + " || " + réponse + " || " + thème;
    }

    public static void main(String[] args)
    {

    }
}
