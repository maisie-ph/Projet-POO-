package GameQR;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


public class Thèmes
{
    private static ArrayList<String> liste_thèmes;
    private static String thèmes;

    public Thèmes(String thèmes)
    {
        this.thèmes = thèmes;
        this.liste_thèmes= new ArrayList<String>();
    }

    public static void setThèmes(String thèmes) {
        Thèmes.thèmes = thèmes;
    }

    public static ArrayList<String> getListe_thèmes() {
        return liste_thèmes;
    }

    public static String getThèmes() {
        return thèmes;
    }

    public static void addThèmes(Thèmes thèmes)
    {
        liste_thèmes.add(Thèmes.getThèmes());
    }

    public static void Afficher_Thèmes()
    {
        System.out.println(liste_thèmes);
    }


    public void Select_Thèmes()
    {
        Random r = new Random();
        for(int i = 0; i < 5; i++)
        {
            int index = r.nextInt(liste_thèmes.size())+1;
            System.out.println(liste_thèmes.get(index));
        }
    }


    public static void main(String[] args)
    {

    }
}
