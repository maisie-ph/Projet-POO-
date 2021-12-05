package GameQR;

import java.util.ArrayList;

public class PhaseIII implements Phase
{

    @Override
    public void select_Joueur(ArrayList<String> listjoueur) {

    }

    @Override
    public void PhaseI(Joueur joueur1, Joueur joueur2, Joueur joueur3, Joueur joueur4) {

    }

    @Override
    public void PhaseII(Joueur joueur1, Joueur joueur2, Joueur joueur3) {

    }

    @Override
    public void PhaseIII(Joueur joueur1, Joueur joueur2) {

    }

    public void ScoreJoueur()
    {
        int score = 0;
        int cpt = 0;
        while (cpt<=20)
        {
            cpt++;
            if(QCM.BonneReponse("","")==true || VF.VraiouFaux("","")==true || RC.ReponseCorrect("")==true)
            {
                score += 1;
            }
            else
            {
                score = score;
            }

        }
        System.out.println("Votre score est de : "  + score+"/"+20);
    }

    public void scoreMin()
    {
        Joueur.selectJoueur();
        ScoreJoueur();
        int [] Liste_score = new int[2];
        int min_score = Liste_score[0];
        for (int sc=0; sc<Liste_score.length; sc++)
        {
            Liste_score[sc] = Joueur.ScoreJoueur();
        }
        for (int m=0; m<Liste_score.length; m++)
        {
            if(min_score >= Liste_score[m+1])
            {
                min_score = Liste_score[m+1];
                System.out.println("Le joueur ayant le score de : " + min_score + " est éliminé");
            }
            else
            {
                min_score = Liste_score[0];
                System.out.println("Le joueur ayant le score de : " + min_score + " est éliminé");
            }

        }
    }

    public static void main(String[] args)
    {

    }
}
