package GameQR;

import java.util.ArrayList;
import java.util.Random;

public class Joueur implements Phase
{
    private String nom;
    private String prénom;
    private ArrayList<String> listjoueur;

    public Joueur(String nom, String prénom, String [] listjoueur)
    {
        this.nom = nom;
        this.prénom = prénom;
        this.listjoueur = new ArrayList<String>();
        for(int i = 0; i < listjoueur.length; i++){
            this.listjoueur.add(listjoueur[i]);
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void selectJoueur()
    {
        for(int i=0; i < 4; i++)
        {
            Random r = new Random();
            int index = r.nextInt(0,listjoueur.size());
            System.out.println(listjoueur.get(index));
        }
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



    @Override
    public String toString() {
        return "Joueur{" +
                "nom='" + nom + '\'' +
                "prénom'" + prénom +
                '}';
    }


    @Override
    public void select_Joueur(ArrayList<String> listjoueur) {

    }

    @Override
    public void PhaseI(Joueur joueur1, Joueur joueur2, Joueur joueur3, Joueur joueur4) {

    }

    @Override
    public void PhaseII() {

    }

    @Override
    public void PhaseIII() {

    }

    public static void main(String[] args)
    {

    }
}
