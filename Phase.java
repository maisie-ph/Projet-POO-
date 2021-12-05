package GameQR;

import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;

public interface Phase
{
    void select_Joueur(ArrayList<String> listjoueur);
    void PhaseI(Joueur joueur1, Joueur joueur2, Joueur joueur3, Joueur joueur4);
    void PhaseII(Joueur joueur1, Joueur joueur2, Joueur joueur3);
    void PhaseIII(Joueur joueur1, Joueur joueur2);


    public static void main(String[] args)
    {

    }
}
