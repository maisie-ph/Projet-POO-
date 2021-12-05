package GameQR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Joueur
{
    private String nom;
    private String prénom;
    private static ArrayList<String> listjoueur;

    public Joueur(String nom, String prénom)
    {
        this.nom = nom;
        this.prénom = prénom;
        this.listjoueur = new ArrayList<String>();
    }

    public static void addJoueur(Joueur joueur)
    {
        listjoueur.add("{ "+joueur.getPrénom() +", "+ joueur.getNom()+" }");
    }

    public void setListjoueur(ArrayList<String> listjoueur) {
        this.listjoueur = listjoueur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public ArrayList<String> getListjoueur() {
        return listjoueur;
    }

    public static void selectJoueur()
    {
        for(int i=0; i < 4; i++)
        {
            Random r = new Random();
            int index = r.nextInt(0, listjoueur.size());
            System.out.println(listjoueur.get(index));
        }
    }

    public static void TabJoueurs()
    {
        System.out.println(listjoueur);
    }

    public static int ScoreJoueur()
    {
        int score = 0;
        int cpt = 0;
        while (cpt<=20)
        {
            cpt++;
            if(QCM.BonneReponse("","")==true ||
                    VF.VraiouFaux("","")==true ||
                    RC.ReponseCorrect("")==true)
            {
                score += 1;
            }
            else
            {
                score = score;
            }

        }
        return score;
    }


    public static void main(String[] args)
    {

    }
}
